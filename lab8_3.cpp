#include <iostream> 
#include <cmath>     //allows you to use functions such as sin, cos, tan, etc. 
using namespace std; 

int main() 
{ 
    // Declare variables (such as to track the best angle and distance)
    double angle;
    double distance;
    double bestAngle;
    double bestDistance = 0;
    double velocity;
    double bestVelocity;
    const double PI = 3.14159;
    double energyLimitation;
    double bestEnergy;

    // Calculate the distance for angles from 0-90 
    for (angle = 0; angle < 91; ++angle ) 
    {
        // Calculate the distance for velocities from 0-50
        for (velocity = 0; velocity < 51; ++velocity)
        {
            // Calculate distance given angle and velocity
            double angleRadians = angle*(PI/180); 
            distance = pow(velocity,2)*((sin(2*angleRadians))/9.8);

            // Calculate energy needed to launch
            energyLimitation = 0.5*pow(velocity,2)*0.25;

            // Determine if new (angle, velocity) gives a best distance
            if(distance > bestDistance && energyLimitation < 100)
        { 
            bestDistance = distance;
            bestAngle = angle;
            bestVelocity = velocity;
            bestEnergy = energyLimitation;
        } 
        }
    }

    // Display the best angle and velocity choice for the catapult
    cout << "The angle and velocity to launch the snowball farthest is "
         << bestAngle
         << " degrees and "
         << bestVelocity
         << " m/s which requires "
         << bestEnergy
         << " joules and will launch the snowball "
         << bestDistance
         << " meters."
         << endl;

    return 0; 
} 
