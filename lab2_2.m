% Make D a 4x4 matrix with all elements equal to 2 (USE A FUNCTION YOU KNOW TO
% DO THIS!!)

D = ones(4);
D(1:4,1:4) = 2;

% Delete the first row from D

D(1,:) = [];

% Delete the 3rd column from D

D(:,3) = [];

% The following line is done for you. It subtracts D from the magic square
% matrix and reassigns it to D
D = magic(3) - D;

% Create a new row of D that has the same values as the first row of D
% Hint: D should now have 4 rows

D(4,:) = D(1,:);

% Assign E to be the dimensions of the matrix D, E should be a row vector
% describing D (number of rows, number of columns)

E = size(D);

% Make a 3x2 matrix F with all elements being 4 (USE A FUNCTION YOU KNOW TO
% DO THIS!!)

F = ones(3,2);
F(1:3, 1:2) = 4;

% Assign the middle row of F to be the row vector E

F(2, 1:2) = E;

% Double the values in the first column of F

temp = F(1:3, 1).*2; 

F(1:3, 1) = temp;

% Assign G to be the total sum of all of matrix F
 
G = sum(F);
G = G(1) + G(2)
 
% % Create a matrix for the means of each column of D

 H = mean(D);

% % Create a matrix for the median of each column of D

 I = median(D);
 
 