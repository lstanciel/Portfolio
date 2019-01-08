#include <cmath>
#include <iostream>
using namespace std;

double volume;
double surfaceArea;
double cuboid;
double width;
double height;
double length;

//Student #1 TODO: Add return type, perform volume calculation
double calculateCuboidVolume(int x, int y, int z)
{
    volume = x*y*z;

    return volume;
}

//Student #2 TODO: Add return type, perform surface area calculation
double calculateCuboidSurfaceArea(int a, int b, int c)
{
    surfaceArea = 2*(a*c) + 2*(b*c) + 2*(a*b);

    return surfaceArea;
}

// TODO: Add a return type (HINT: Should this function return anything?), finish prompting user for inputs
void printCuboid(int w, int h, int l)
{
    cout << "Cuboid: ";
    cout << "w = " << w << ", ";
    cout << "h = " << h << ", ";
    cout << "l = " << l << ", ";
    cout << "volume = " << volume << ", ";
    cout << "surface area = " << surfaceArea << endl;

}


// TODO: Add 3 input parameters (HINT: The function is void, so we need to directly modify input variables and return nothing)
void promptForCuboid(int e, int f, int g)
{
    cout << "Enter width: "; 
    cin >> e;

    cout << "Enter height: "; 
    cin >> f;

    cout << "Enter length: ";
    cin >> g;

    width = e;
    height = f;
    length = g;

}

double w;
double h;
double l;

int main() {
// Read a width, height, and length for a cuboid
promptForCuboid(width, height, length);

w = width;
h = height;
l = length;

//Call all the functions

calculateCuboidVolume(width, height, length);
calculateCuboidSurfaceArea(width, height, length);

// Print the cuboid
printCuboid(width, height, length);

}