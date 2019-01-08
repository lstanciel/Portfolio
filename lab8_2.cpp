#include <iostream> 
#include <cmath>     //allows you to use functions such as sin, cos, tan, etc. 
using namespace std; 

int main() 
{ 
    // Declare variables (such as to track the best angle and distance)
    double bestDistance = 0;
    double bestAngle;
    const double PI = 3.14159;
    double angle;
    double distance;

    // Calculate the distance for angles from 0-90 
    for (angle = 0; angle < 91; ++angle ) 
    { 
        // Declare variables
        int velocity;
    
        // Determine the velocity based off of the angle 
        if (angle >= 0 && angle <= 30) 
        { 
            velocity = 45;
        } 
        else if (angle > 30 && angle < 61 ) 
        {  
            velocity = 40;  
        } 
        else 
        { 
            velocity = 30;
            }
         

        // Calculate distance given the angle and velocity
        double angleRadians = angle*(PI/180); 
        distance = pow(velocity,2)*((sin(2*angleRadians))/9.8);

        // Determine if the current angle gives a new best distance
        if(distance > bestDistance )
        { 
            bestDistance = distance;
            bestAngle = angle;
        } 
    } 

    // Display the best angle choice for the catapult
    cout << "The angle to launch the snowball furthest is "<< bestAngle << " which yeilds a distance of " << bestDistance << " meters" << endl;

    return 0; 
} 
