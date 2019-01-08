function [new_grade] = lab3_2(grades, gsi, curve)

%grades: a 10x10 matrix with lab grades for 100 students

%gsi: a 10x10 matrix indicating which gsi each of the 100 students is
%assigned to. This matirx only contains the numbers 0 to 9, with each
%number representing each gsi.

%curve: this the value of the curve added to each grade it is 10.

%Deduct three points from all students in Madhav's sections
gsi(gsi == 0) = grades(gsi == 0) - 3;

%Add 10 points to all students in Ruby and Leila's sections 
gsi(gsi == 8 & gsi == 5) = grades(gsi == 8 & gsi == 5) + 10;

%Add 5 points to all students in the remaining sections
gsi(gsi ~= 0 | gsi ~= 5 | gsi ~= 8) = grades(gsi ~= 0 | gsi ~= 5 | gsi ~= 8) + 5;

%Add the curve to all grades
gsi = gsi + curve;

%Set all grades below 50 to 0
grades(grades < 50) = 0;

%Set all grades over 100 to 100%
grades(grades > 100) = 100;

%Creates a matrix of the new grades after all the adjustments
new_grade = grades;



