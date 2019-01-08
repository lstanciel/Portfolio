%% Graph 1, US Gross National Product
% Load the lab5_1_GNP.mat data into MATLAB

% Set the location of this graph as the top left corner of the figure
% Hint: use subplot()
  subplot(2, 2, 1);

% Plot Graph 1 with years on the x-axis and GNP on the y-axis
  plot(years, GNP);
  
% Title Graph 1 as 'US GNP, 1947-2005'
  title('US GNP, 1947-2005');
  
% Label the x-axis as 'Year'
  xlabel('Year');
  
% Label the y-axis as 'Billion Dollars (2000)'
  ylabel('Billion Dollars (2000)');

%% Graph 2, Quadratic Function
% Create a vector, x1, with values from 0 to 10 with increments of 0.01
  x1 = [0:0.01:10];

% Create a vector, y1, with the same dimensions of x1, where y1 is x1 squared
  y1 = x1.^2;

% Plot this graph in the top right corner of the figure
  subplot(2, 2, 2);
  
% Use a red line with circle markers when plotting  
% Use your x variable for the x-axis and y variable as the y-axis
 plot(x1, y1, 'ro');
 
% Title this graph as 'Graph of a Quadratic Function'
  title('Graph of a Quadratic Function');
  
% Label the x-axis as 'x'
  xlabel('x');
  
% Label the y-axis as 'y'
  ylabel('y');


%% Graph 3, Square Root Function
% Create a vector, x2, of x values from 0 to 10 with increments of 0.01
  x2 = [0:0.01:10];
  
% Create a vector, y2, of y values where y is the square root of x
  y2 = sqrt(x2);

% Plot this graph in the bottom left corner of the figure
  subplot(2,2,3);
  
% Use your x variable for the x-axis and y variable as the y-axis
% Use a green solid line when plotting
  plot(x2, y2, 'g');

% Title this graph as 'Graph of a Square Root Function'
  title('Graph of a Square Root Function');
  
% Label the x-axis as 'x'
  xlabel('x');
  
% Label the y-axis as 'y'
  ylabel('y');


%% Graph 4, Multiple Functions on One Plot!
% Plot the functions from Graph 2 and Graph 3 on the same plot
% Set the location of this graph as the bottom right corner of the figure
% Hint: use one plot() function
subplot(2, 2, 4);
plot(x1, y1, x2, y2);

% Set the x-axis bounds from 0 to 10 and the y-axis bounds from 0 to 5
  axis([0 10 0 5]);

% Title this graph as 'Graph of Two Functions'
  title('Graph of Two Functions');
  
% Label the x-axis as 'x'
  xlabel('x');
  
% Label the y-axis as 'y'
  ylabel('y');

% Add a legend in the bottom right corner of the graph
% Label the functions as 'y = x^2' and 'y = sqrt(x)'
  legend('y = x^2', 'y = sqrt(x)');


%% Put data into a compiled matrix
% Place your y1 and y2 data in a matrix
% Ensure the matrix has two columns (instead of two rows)
% Hint: you may have to transpose your data
y1 = transpose(y1);
y2 = transpose(y2);

dimensions = size(y1);
DoubleY = [y1(:), y2(:)];

%% Saving data as a PNG
% Save the figure (with the four plots) to the file 'lab5_1.png'
% Hint: print(filename, filetype)

