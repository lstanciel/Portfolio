timeUsed = [0.5 4.0 8.0 1.2;
            3.0 0.0 0.0 5.0;
            7.4 0.0 0.0 3.5;
            2.0 1.0 1.5 4.0];
 
price = [0.8 0.8 0.9 0.9;
         0.8 0.0 0.0 0.9;
         1.5 0.0 0.0 1.5;
         1.5 1.5 1.5 1.9];
     
revenue = parkingRevenue(timeUsed, price);
result = revenue;
expectedResult = 49.4800;
assert(almostEqual(result, expectedResult));

timeUsed = [1.5 4.0 8.0 1.2;
            3.0 0.0 0.0 5.0;
            7.4 0.0 0.0 3.5;
            2.0 1.0 2.5 4.0];
 
price = [0.8 4.8 3.9 0.9;
         0.8 0.0 0.0 5.9;
         1.5 0.0 0.0 1.5;
         1.5 1.5 1.5 7.9];
     
revenue = parkingRevenue(timeUsed, price);
result = revenue;
expectedResult = 140.7800;
assert(almostEqual(result, expectedResult));
%% We only get to this point if all asserts passed successfully
disp('actualLoad: ALL TESTS PASS');
