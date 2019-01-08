%Quintin Leary, Partner: Lauren Stanciel, Section 010, 10-10-18
%Partner Uniquename and section: Stanciel
%Partner Section: 035
%10/23/18

function [ c1, c2, c3, c4, c5 ] = analyzeWindFarm( filenameWind, filenameWave, filenameBuoy, windSpeedMin, windSpeedMax, waveHeightMax, waveHeightRisk, deckHeight )
% Function to complete Task 1. Evaluates the 5 constraints on the location of a
% wind farm.
%
%   parameters: 
%          filenameWind: a string that names the file containing the 
%                        global-model-based average wind speed 
%                        (i.e. 'windSpeedTestCase.csv')
%          filenameWave: a string that names the file containing the 
%                        global-model-based average global wave heights 
%                        (i.e. 'waveHeightTestCase.csv')
%          filenameBuoy: a string that names the file containing the time 
%                        series of wave heights measured by the buoy          
%                        (i.e. 'buoyTestCase.csv')
%          windSpeedMin: for constraint 1 -- minimum wind speed (m/s)
%          windSpeedMax: for constraint 1 -- maximum wind speed (m/s)
%         waveHeightMax: for constraints 2 & 3 -- maximum wave height (m)
%        waveHeightRisk: for constraint 3 -- maximum wave height risk (%)
%            deckHeight: for constraint 4 -- height of the deck that supports 
%                        the turbine base (m)
%
%   return values:
%                    c1: boolean values corresponding to whether the wind 
%                        farm location passes constraint #1
%                    c2: boolean values corresponding to whether the wind 
%                        farm location passes constraint #2
%                    c3: boolean values corresponding to whether the wind 
%                        farm location passes constraint #3
%                    c4: boolean values corresponding to whether the wind 
%                        farm location passes constraint #4
%                    c5: boolean values corresponding to whether the wind 
%                        farm location passes constraint #5

%% YOUR CODE HERE
%read in buoy info
buoyLoc = csvread(filenameBuoy,1,1,[1,1,1,2]);

%Constraint 1
%Reads in the windSpeed info 
windSpeeds = csvread(filenameWind);
%Checks to see if the global-model-based average wind speed at propsed
%location is within the right range
%Find the wind speed at the buoy location and check if it is between the
%min and max.
c1 = (windSpeeds(buoyLoc(1),buoyLoc(2)) <= windSpeedMax) & (windSpeeds(buoyLoc(1),buoyLoc(2)) >= windSpeedMin);

%Constraint 2
%Read in global wave heights, look specifically at the buoy location and
%check if it is less than the the max wave height.
waveHeights = csvread(filenameWave);
c2 = (waveHeights(buoyLoc(1), buoyLoc(2)) < waveHeightMax);

%Constraint 3
%Read in the relevant numeric buoy information
buoyWaveInfo = csvread(filenameBuoy,5,1);
%Index to zero in only on wave heights
buoyWaveHeights = buoyWaveInfo(:,1);
%Create a logical matrix showing which waves are less than the max.
wavesLowerThanMax = (buoyWaveHeights < waveHeightMax);
%Find the number of waves less than max and divide by the total.
%Make it a percentage and evaluate if it is greater than waveHeightRisk
c3 = (waveHeightRisk < (100.*((sum(sum(wavesLowerThanMax))./numel(buoyWaveHeights)))));

%Constraint 4
%Check if all buoy wave heights multiplied by 2 are less than the deck
%height.
c4 = all((buoyWaveHeights.*2) < deckHeight);

%Constraint 5
%See if the standard deviation of the buoy wave heights is less than 5% of
%the global wave heights at that location.
c5 = std(buoyWaveHeights) < (waveHeights(buoyLoc(1),buoyLoc(2)).*0.05);


end

