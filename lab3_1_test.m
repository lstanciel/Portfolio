% Read the image from the file
img = imread('evil1.jpg');

% Converts from RGB to HSV (hue, value, saturation)
img = rgb2hsv(img);

% Fixes the image with our function
img = lab3_1_recolor(img);
%Error Found: This was an error because it called the function, but there
%was no image in the function for it to run on.

% Converts from HSV to RGB
img = hsv2rgb(img);

% Displays the image
imshow(img);

