% Create a random gsi and grades matrix
rng(15);
gsi = floor(rand(10)*10);
grades = rand(10)*100;
curve = 10;

new_grades = lab3_2(grades, gsi, curve);
