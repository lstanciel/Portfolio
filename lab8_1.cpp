#include <iostream> 
#include <cmath>     //allows you to use functions such as sin, cos, tan, etc. 
using namespace std; 

int main() 
{ 
    int month;
    
    //Read in the month variable
    cout << "What month were you born in? ";
    cin >> month;

    for(int x = 0; x < 1; x++)
    {
        if(month > 2 && month < 7)
        {
            cout << "Your birthday is in Spring" << endl;
        }

        else if(month > 5 && month < 9)
        {
            cout << "Your birthday is in Summer"<< endl;
        }

        else if(month > 8 && month < 12)
        {
            cout << "Your birthday is in Fall"<< endl;
        }

        else if(month > 11 && month < 3)
        {
            cout << "Your birthday is in Winter"<< endl;
        }

        else
        {
            cout << "Your birthday does not exist"<< endl;
        }
    }
}


