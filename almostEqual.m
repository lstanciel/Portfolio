
% Helper function to compare floating point values
function [isEqual] = almostEqual(actual, correct)
    isEqual = all(abs(actual - correct) < 0.01);
  end