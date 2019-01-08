%Test #1
roofHeight = 10;
pallets = [3, 2, 4;
           4, 1, 3;
           1, 4, 5];
palletHeight = 2;

ap = additionalPallets(roofHeight, pallets, palletHeight);

result = ap;
expectedResult = 18;
assert(almostEqual(result, expectedResult));

%Test #2
roofHeight = 7;
pallets = [3, 3, 2, 3;
           2, 1, 2, 2;
           3, 1, 2, 1;
           1, 1, 3, 1;];
palletHeight = 2;

ap = additionalPallets(roofHeight, pallets, palletHeight);

result = ap;
expectedResult = 17;
assert(almostEqual(result, expectedResult));
%% We only get to this point if all asserts passed successfully
disp('actualLoad: ALL TESTS PASS');

