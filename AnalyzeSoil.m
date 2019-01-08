%All amounts have units of centimoles of charge per kilogram of soil.

sodium = 10.90;
% the amount of sodium in the soil sample

potassium = 68.22;
% the amount of potassium in the soil sample

calcium = 25.41;
% the amount of calcium in the soil sample

magnesium = 13.77;
% the amount of magnesium in the soil sample

ESP = sodium/(potassium + calcium + magnesium + sodium);
% the exchangeable sodium percentage

display('This is the ESP');
disp(ESP);
display('centimoles of charge per kilogram of soil.');