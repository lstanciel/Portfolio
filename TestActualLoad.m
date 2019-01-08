%Lauren Stanciel
%None
%Section 035
%9/27/18

%% Unit test for a case with the largest load in quadrant 1 
W = [5, 4, 4, 3 ;
     3, 9, 8, 3 ;
     4, 2, 1, 8 ;
     3, 4, 1, 2 ];
 
result = actualLoad(W);
expectedResult = 21;
assert(almostEqual(result, expectedResult));

% REQUIRED - Add more tests here

%Test if actualLoad fails when the maximum load is in the 1st quadrant.
W = [15, 14, 4, 3 ;
     13, 9, 8, 3 ;
     4, 2, 1, 8 ;
     3, 4, 1, 2 ];
 
result = actualLoad(W);
expectedResult = 51;
assert(almostEqual(result, expectedResult));

%Test if actualLoad fails when the maximum load is in the 2nd quadrant.
W = [5, 4, 14, 13 ;
     3, 9, 18, 13 ;
     4, 2, 1, 8 ;
     3, 4, 1, 2 ];
 
result = actualLoad(W);
expectedResult = 58;
assert(almostEqual(result, expectedResult));

%Test if actualLoad fails when the maximum load is in the 3rd quadrant.
W = [5, 4, 4, 3 ;
     3, 9, 8, 3 ;
     14, 12, 1, 8 ;
     13, 14, 1, 2 ];
 
result = actualLoad(W);
expectedResult = 53;
assert(almostEqual(result, expectedResult));

%Test if actualLoad fails when the maximum load is in the 4th quadrant.
W = [5, 4, 4, 3 ;
     3, 9, 8, 3 ;
     4, 2, 11, 18 ;
     3, 4, 11, 12 ];
 
result = actualLoad(W);
expectedResult = 52;
assert(almostEqual(result, expectedResult));

%Test if actualLoad fails for non-square matrices(eg. 2x6).
W = [5, 4, 4, 3, 3, 1;
     3, 9, 8, 3, 3, 1;];

result = actualLoad(W);
expectedResult = 20;
assert(almostEqual(result, expectedResult));

%Test if actualLoad fails when two quadrants both have the maximum load.
W = [5, 4, 4, 3 ;
     3, 9, 8, 3 ;
     4, 2, 5, 4 ;
     3, 4, 3, 9 ];
 
result = actualLoad(W);
expectedResult = 21;
assert(almostEqual(result, expectedResult));

%% We only get to this point if all asserts passed successfully
disp('actualLoad: ALL TESTS PASS');
