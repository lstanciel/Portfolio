% 1. Insert code to clear out every variable in the workspace

% 2. Load lab4_1_water.mat which contains the Flint Service Line data

% 3. Find a logical array for all areas that have ALL 3 of the following
%    properites
%		- have a precinct LESS THAN the average of all precincts
%		- are greater than 0.01 acres in area
%		- are neither in cenblock 3 nor in cenblock 5

average = mean(mean(Precinct));

target = ((average > Precinct)&(Cenblock ~= 5 & Cenblock ~= 3) & (Acres > 0.01)); 

% 4. Use the target logical array to find the zipcodes of these areas

zipcodes = Zip(target == 1);

% 5. Save the workspace variables as lab4_1
