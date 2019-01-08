% 1. Insert code to clear out every variable in the workspace

% 2. Load the image lab4_2.png
img = imread('lab4_2.png');

% 3. Extract the R, G, and B layers into variables
red = img(:,:,1);
green = img(:,:,2);
blue = img(:,:,3);

% 4. Using logical arrays, if the R value is greater than 100, subtract 50
red(red > 100) = red(red > 100) - 50;

% 5. Using logical arrays, if the G value is less than 150, add 100
green(green < 150) = green(green < 150) + 100;

% 6. Using logical arrays, if the B value is strictly between 50 and 100,
% 	 double the value
blue(50 < blue < 100) = blue(50 < blue < 100) .* 2;

% 7. Note that we have only changed red, green, and blue
%    and that our image 'img' has not changed.
%	 Copy the red, blue, and green layers back into 'img'
img(:,:,1) = red;
img(:,:,2) = green;
img(:,:,3) = blue;

% 8. Save the image as lab4_2.jpg
imwrite(img, 'lab4_2.jpg');

