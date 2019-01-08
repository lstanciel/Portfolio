% Make the column vector A as given in the lab spec

A = [1;2;3;4;5];

% Replace the middle element in A with the number 4

A(3) = 4;

% Change the value of the 4th element in A to be the same as the 2nd element in A 
% This line of code should work for any 5 element matrix - DO NOT HARD CODE THE NUMBER
% i.e. Do not just set A(4) = 2

A(4) = A(2);

% Change the 5th element in A to be the same as the 1st element in A 
% This line of code should work for any 5 element matrix - DO NOT HARD CODE THE NUMBER

A(5) = A(1);

% Make the row vector B as given in the lab spec

B = [1:1:5];

% Change the last 3 elements in B to be the same as the first 3 elements in B 
% DO NOT HARD CODE THE NUMBERS

B(3:5) = B(1:3);

% Add the number 2 to the 1st element in B

B(1) = B(1) + 2;

% Make B a column vector (i.e. transpose)

B = B.';

% Create a new variable C, that is assigned to be the product of A and B

C = A.*B;

