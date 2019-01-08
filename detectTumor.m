%Quintin Leary, Partner: Lauren Stanciel, Section 010, 10-10-18
%Partner Uniquename and section: Stanciel
%Partner Section: 035
%10/10/18

function [ hasTumor ] = detectTumor( brain )
    %detectTumor Returns whether or not a tumor was found in the image.
    %     brain: a matrix of numbers representing a grayscale image of a 
    %            brain scan.  Bright areas may be tumors and need to
    %            be flagged for further testing.  Get the numbers for 
    %            this matrix by first calling the scan_brain() function
    %            provided and then passing in the matrix to this 
    %            function.
    
    %This smooths out the image and removes the extra white dots
    TempBrain = removeNoise(brain, 10);
    
    %This gives us a logical matrix of the parts of the brain that are
    %white(greater than 0.8).

    whiteBrain(TempBrain > 0.8) = 1;
    whiteBrain(TempBrain < 0.8) = 0;
    
    %This gives us the total number of white parts in the brain without a
    %tumor
    totalWhite = sum(sum(whiteBrain));
   
    totalWhite(totalWhite > 0) = 1;
    totalWhite(totalWhite == 0) = 0;

    %This tell us if the brain has a tumor or not
    hasTumor(totalWhite == 1) = 1;
    hasTumor(totalWhite == 0) = 0;
end

