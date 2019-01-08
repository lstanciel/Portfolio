%Lauren Stanciel
%
%Section 035
%10/10/18

function [ img ] = zones( img, rad )
    %zones Generates an image colored according to radiation threat 
    %  zones. Values from rad are used to determine the zone, and the hue
    %  value in img is set accordingly.
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
    
    %Sets saturation to 1
    sat = 1;
    
    %Creates the blue zone with radiation levels [0,20)mSv/hr
    hue(0 <= rad & rad < 20) = 0.60;
    
    %Creates the green zone with radiation levels [20,50)mSv/hr
    hue(20 <= rad & rad < 50) = 0.40;
    
    %Creates the yellow zone with radiation levels [50,70)mSv/hr
    hue(50 <= rad & rad < 70) = 0.20;
    
    %Creates the orange zone with radiation levels [70,90)mSv/hr
    hue(70 <= rad & rad < 90) = 0.10;
    
    %Creates the red zone with radiation levels 90+ mSv/hr
    hue(rad >= 90) = 0;
    
    %Copies the changed back into the original image
    img(:, :, 1) = hue;
    img(:, :, 2) = sat;
    
    %Converts the img backt to rgb format
    img = hsv2rgb(img);

end

