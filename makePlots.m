%Quintin Leary, Partner: Lauren Stanciel, Section 010, 10-10-18
%Partner Uniquename and section: Stanciel
%Partner Section: 035
%10/23/18
function [  ] = makePlots( filenameWind, filenameWave, filenameBuoy, windSpeedMin, windSpeedMax, waveHeightMax )

% Function to complete Task 2. Creates a figure with multiple plots that 
% summarizes the environmental conditions for a wind farm.  Saves figure as 
% a .png file.
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
%         waveHeightMax: for constraint 2 -- maximum wave height (m)
%
%   return values: none
%
%   notes:
%       Feel free to use different variable names than these if it makes 
%       your code more readable to you.  These are internal to your 
%       function, so it doesn't matter what you call them.

%% Load the data

% Get lat/lon data
lat = csvread('lat.csv');
lon = csvread('lon.csv');

% Read in the rest of the data you need...
windSpeed = csvread(filenameWind);
waveHeight = csvread(filenameWave);
buoy = csvread(filenameBuoy, 5, 0);
buoyLoc = csvread(filenameBuoy,1,1,[1,1,1,2]);
%% Figure Setup

% Set up the figure properties so it will be the correct size
Fig1 = figure(1);
Fig1.Units = 'normalized';
Fig1.OuterPosition = [0 0 0.5 1];

%% Make Plots

%Map of average wind speed across the planet(measured globally)
%Plot 1
subplot(3, 2, 1);

%Creates a mesgrid of the latitude and longitude
[Lon, Lat] = meshgrid(lon, lat);

%Creates a map of the average wind speed vs the latitude and longitude
contourf(Lon, Lat, windSpeed, 'linestyle', 'none');
colormap('parula');

%Places the colorbar in the correct location
colorbar('eastoutside');

%Creates a title for the graph
title('Average Wind Speed (m/s) Across Planet');

%Creates a title for the x-axis
xlabel('longitude (deg)');

%Creates a title for the y-axis
ylabel('latitude (deg)');

%Map of average wave height across the planet(measured globally)
%Plot 2 
subplot(3, 2, 2);

%Creates a mesgrid of the latitude and longitude
[Lon, Lat] = meshgrid(lon, lat);

%Creates a map of the average wind speed vs the latitude and longitude
contourf(Lon, Lat, waveHeight, 'LineStyle', 'none');
colormap('parula');

%Places the colorbar in the correct location
colorbar('eastoutside');

%Creates a title for the graph
title('Average Wave Height (m) Across Planet');

%Creates a title for the x-axis
xlabel('longitude (deg)');

%Creates a title for the y-axis
ylabel('latitude (deg)');

% Map of all potential wind farm locations 
% Plot 3
subplot(3,2,3);

%Creates a mesgrid of the latitude and longitude
[Lon, Lat] = meshgrid(lon, lat);

c1 = (windSpeed < windSpeedMax) & (windSpeed> windSpeedMin);
c2 = waveHeight < waveHeightMax;
c1andc2 = (c1 & c2);

contourf(Lon, Lat, c1andc2, 'LineStyle', 'none');
%This uses the gray colormap in reverse

invertedMap = flipud(colormap(gca, 'gray'));
colormap(gca, invertedMap);

%Adds a red sqaure at the buoy location
xLoc = lon(buoyLoc(2));
yLoc = lat(buoyLoc(1));

hold on;
plot(xLoc,yLoc,'s','MarkerEdgeColor','r','MarkerSize',12);
hold off;

%Creates atitle for the graph
title('Potential Wind Farm Locations');

%Creates a title for the x-a xis
xlabel('longitude (deg)');

%Creates a title for the y-axis
ylabel('latitude (deg)');

%Histogram of buoy measured wave heights
%Plot 4
subplot(3, 2, 4);

BuoyWaveHeight = buoy(:, 2);
histogram(BuoyWaveHeight);

%This makes grid lines appear
grid on;

%Creates a title for the graph
title('Wave Heights at Buoy Location');

%Creates a title for the x-axis
xlabel('wave height (m)');

%Creates a title for the y-axis
ylabel('number of occurences');

%Time series of buoy measured wave heights
%Plot 5
subplot(3,2,5:6);

%Get values for the buoy measured wave heights vs time
x1 = buoy(:, 1);
y1 = buoy(:, 2);

%Get the average wave height
dimensions = size(x1);
tempMatrix = ones(dimensions(1), dimensions(2));
globalAverage = waveHeight(18, 75);
average = tempMatrix .* globalAverage;

x2 = x1;
y2 = average;

%Plot the average wave height
plot(x1, y1, x2, y2);

%This makes grid lines appear
grid on;

%Creates a title for the graph
title('Wave Height Comparison: Global to Local (by Lauren Stanciel and Quinn Leary)');

%Creates a title for the x-axis
xlabel('time(hours)');

%Creates a title for the y-axis
ylabel('wave height(m)');

%Creates a legend for the graph
legend('Buoy-measured', 'Global Average'); 

print('environmentalSummary', '-dpng');
end

