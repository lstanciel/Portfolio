%Lauren Stanciel

%This reads in the 3_EngineeringUndergraduateCreditHours.csv file with the data, but omits the titles
EUCH = csvread('3_EngineeringUndergraduateCreditHours.csv', 3, 0);

%This first graph will display the total number of credit hours for all
%undergraduate years vs time(years). This will let us look at the general
%trend to see if U-M is seeing a general increase of students in programs.

%This takes the values used for the x and y axis from the data file. 
x1 = EUCH(:, 1);
y1 = EUCH(:, 6);

%This plots the data.
plot(x1, y1);

%This labels the graph, axis, and creates a legend.
xlabel('Time (year)');
ylabel('Number of Credit Hours');
title('Engineering Undergraduate Credit Hours vs Time');
legend('Total Engineering Undergraduate Credit Hours');

%This saves the graph as an image.
print('lab6_1', '-dpng');

%This second graph will display each of undergraduate years vs time(year) as a line plot
%This takes in the x and y values to plot each undergraduate year vs time.
%This will show us is the general is being brought up or down by one
%specific year of undergraduates or if it truly represents the sum total
%correctly. And it also lets us look to see if the total or the individual
%grades have a downward trend during the last few years. 

%Gives us the data for the last few years for each undergraduate year and
%the total of all four collective years.
EUCH2 = csvread('3_EngineeringUndergraduateCreditHours.csv', 15, 0);

x1 = EUCH2(:, 1);
y1 = EUCH2(:, 2);

x2 = x1;
y2 = EUCH2(:, 3);

x3 = x1;
y3 = EUCH2(:, 4);

x4 = x1;
y4 = EUCH2(:, 5);

x5 = x1;
y5 = EUCH2(:, 6);

%This plots each of the data sets onto the same plot as different graphs.
plot(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);

%This labels the graph, axis, and creates a legend.
xlabel('Time (year)');
ylabel('Number of Credit Hours');
title('Engineering Undergraduate Credit Hours vs Time');
legend('Freshman', 'Sophmore', 'Junior', 'Senior', 'Total');

%This saves the graph as an image.
print('lab6_2', '-dpng');
