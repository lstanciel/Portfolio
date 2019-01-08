%Lauren Stanciel
%
%Section 035
%10/10/18

function [ img ] = heatmap( img, rad )
    %heatmap Generates a heatmap image by using values from rad to set
    %  values in the hue channel for img. Hue values vary smoothly
    %  depending on the corresponding radiation level.
    %     img: a 3-dimensional matrix of numbers representing an image in
    %          RGB (red-green-blue) format, which forms the background for
    %          to which the heatmap colors are applied.
    %     rad: a matrix of numbers representing the radiation
    %          measurements, between 0 and 100 millisieverts.
    %          It is has the same width and height as the img parameter.
    
    %Converts the image to the HSV format
    img = rgb2hsv(img);
    
    %Makes copies of the hue and saturation of the img to edit
    hue = img(:, :, 1);
    sat = img(:, :, 2);
    
    %Edits the hue and saturation 
    hue = 0.7 - 0.7 .* rad ./ 100.0;
    sat = 1;
    
    %Copies the changed back into the original image
    img(:, :, 1) = hue;
    img(:, :, 2) = sat;
    
    %Converts the img backt to rgb format
    img = hsv2rgb(img);

end

