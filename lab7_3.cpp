// PURPOSE:
// This program calculates the distance between two points
// A point is composed of (x, y)
// The distance between two points is
//     d = sqrt( (x1-x2)^2 + (y1-y2)^2 )

#include <cmath>
#include <iostream>
using namespace std;

int main()
{
    // 1. Create the variables for our two points and the distance.
    //    Consider what the datatype of these variables should be
    //    HINT: You should have a total of five variables.
    //    HINT: You might have to modify the datatype of x1 and x2
    int x1;
    int y1;
    int x2;
    int y2;
    double distance;
    
    // 2. Prompt the user for the first point
    cout << "Enter x1 and y1 with a space inbetween: ";

    // 3. Read in the first point using "cin"
    cin >> x1;
    cin >> y1;

    // 4. Prompt the user for the second point
    cout << "Enter x2 and y2 with a space inbetween: ";

    // 5. Read in the second point using "cin"
    cin >> x2;
    cin >> y2;

    // 6. Calculate the distance
    //    HINT: use the sqrt and pow functions

    double sqrX;
    double sqrY;
    sqrX = pow(x1-x2, 2);
    sqrY = pow(y1-y2, 2);
    distance = sqrt(sqrX + sqrY);

    // 7. Output the points
    cout << "Point 1: (" << x1 << "," << y1 << ")" << endl;
    cout << "Point 2: (" << x2 << "," << y2 << ")" << endl;

    // 8. Output the distance
    cout << "Distance = " << distance << endl;
}
