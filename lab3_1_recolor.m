function [ outputImg ] = lab3_1_recolor(hsvImg)
                         %Error Found: The name of the file didn't match
                         %the name of the function. It was missing the two
                         %_ the go before and after 1.
                         
% This function takes an hsv image.
% An image is composed of 3 matrices (hue, saturation, and value).
% This function fixes the colors of the OSU algorithm.
% The corrected image is assigned into outputImg.

    % Obtains the hue and saturation layers from the matrix
    % An image has 3D dimensions, which is why we use hsvImg(:, :, layer)
    hue = hsvImg(:, :, 1);
    sat = hsvImg(:, :, 2);
    
    % Fix the green and make it blue
    
    hue(0.35 > hue & hue > 0.25) = hue(0.35 > hue & hue > 0.25) .* 2;
    %Error Found: This was an error because there wasn't the indexing location,
    %the (0.35 > hue & hue > 0.25), on both sides of the equal sign
    
    % Replace the red with yellow
    hue(.15 > hue | (1 > hue & hue > .97)) = 0.15;

    % Increase saturation by a multiplier of 1.2 to make colors more vivid
    
    sat(:, :) = sat(:, :).* 1.2;
    %Error Found: This was a indexing error, because the .* 1.2 was on the
    %wrong side of the equals sign when defining it.
    
    % We modified hue and sat
    % We need to copy these back into hsvImg!
    hsvImg(:, :, 1) = hue;
    hsvImg(:, :, 2) = sat;
    
    %Error Found: outputImg was never assigned.
    outputImg = hsvImg;
end