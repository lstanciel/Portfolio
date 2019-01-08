//Name:Lauren Stanciel
//Uniquename: stanciel, none
//UMID: 38206582
//Section: 003
//Date: 11/13/18
//Difficulty: 4.5/10

#include <cmath>
#include <iostream>
using namespace std;

int main() {

//Define variables
    double bMin = 0;
    double bMax;
    double bMid;
    double bNoDrag;
    double tChange = 0.00001;
    double v0;
    double c_d;
    //x is the inisital postion of the shuttle at the start of the runway
    double x = 0;
    double a;
    double runwayLength;
    double b_optimal;
    double tolerance = 0.000001;
    double simDist;
    double range;
    double vIn;
    

    //Initialize the intial velocity
    cout << "v0 (m/s): ";
    cin >> vIn;
    

    //Initialize the atmospheric drag coefficient
    cout << "c_d (1/m): ";
    cin >> c_d;

    //Initialize the runwayLength
    cout << "runwayLength (m): ";
    cin >> runwayLength;

    //Compute the bNoDrag equation
    bNoDrag = pow(vIn,2)/(2*runwayLength);

    //Set bMax as bNoDrag
    bMax = bNoDrag;

    //Initailize range as (bMin, bMax)
    range = bMax-bMin;

    //Initialize bMid
    bMid = ((bMin+bMax)/2);

    //Check if bMin - bMax > tolerance
        while(range > tolerance){

            //Updates bMid
            bMid = ((bMin + bMax)/2);

            //Resets distance and velocity
            x = 0;
            v0 = vIn;

            //Checks if velocity is positive
            while(v0 >= 0){

                //Calculates acceleration, velocity, and distance
                a = -(bMid) - (c_d) * pow(v0,2);
                v0 = v0 + a * (tChange);
                x = x + v0 * (tChange);
            }
                //Intializes simDist
                simDist = x;

                //Compares simDist to runawayLength
                if(simDist < runwayLength){
                    bMax = bMid;
                   range = bMax - bMin;
                }
                else{
                    bMin = bMid;
                    range = bMax-bMin;
                }
            }  
            //Intializes b_optimal
            b_optimal = bMid;
            cout << "b_optimal = " << b_optimal << endl;
    
    
	return 0;
}
