% Create a 800x1000 white matrix
img = ones(800, 1000);

%Create mouth
img(400:600, 200:800) = 0;

%Create lips
img(500:500, 200:800) = 1;

%Create the left eye
img(100:300, 200:400) = 0;

%Create left pupil
img(150:250, 250:350) = 0.5;

%Create the right eye
img(100:300, 600:800) = 0;

%Create right pupil
img(150:250, 650:750) = 0.5;

% Display the matrix as an image
imshow(img);


