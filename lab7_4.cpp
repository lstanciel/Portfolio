#include <cmath>
#include <iostream>
using namespace std;

int main()
{
  //Creates variables for all the necessary elements of the equation.

  int radius;
  int height;
  double pi;
  double volume;

  //Sets the variable pi equal the a usable number.
  pi = 3.14;

  //Prompts the reader to put in the radius.
  cout << "Enter the radius: ";

  //Reads the radius
  cin >> radius;

  //Prompts the reader to put in the height.
  cout << "Enter the height: ";

  //Reads the height
  cin >> height;

  //Calculates the Volume
  radius = pow(radius, 2);
  volume = pi*radius*height;
  cout << "Volume: " << volume << endl;
}
