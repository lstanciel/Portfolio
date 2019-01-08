%% Unit test for a general case
W = [17, 4, 4, 3 ;
     3, 9, 8, 3 ;
     4, 2, 1, 8 ;
     3, 4, 1, 0 ];
 
result = flooberIndex(W);
expectedResult = 17;
assert(almostEqual(result, expectedResult));

% REQUIRED - Add more tests here
%Maximum corner value is in the Top Left Corner
W = [3, 4, 4, 17 ;
     3, 9, 8, 3 ;
     4, 2, 1, 8 ;
     3, 4, 1, 0 ];
 
result = flooberIndex(W);
expectedResult = 14;
assert(almostEqual(result, expectedResult));

%Maximum corner value is in the Bottom Left Corner
W = [3, 4, 4, 0 ;
     3, 9, 8, 3 ;
     4, 2, 1, 8 ;
     3, 4, 1, 17 ];
 
result = flooberIndex(W);
expectedResult = 14;
assert(almostEqual(result, expectedResult));

%Maximum corner value is in the Bottom Right Corner
W = [3, 4, 4, 0 ;
     3, 9, 8, 3 ;
     4, 2, 1, 8 ;
     17, 4, 1, 0 ];
 
result = flooberIndex(W);
expectedResult = 17;
assert(almostEqual(result, expectedResult));
%% We only get to this point if all asserts passed successfully
disp('flooberIndex: ALL TESTS PASS');
