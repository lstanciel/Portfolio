// Remember, the // indicates a comment!
// The "include" and "using" allow us to use cin and cout
#include <iostream>
using namespace std;

// All C++ programs begin from the main function.
// Note that a function is enclosed by the { }
int main()
{
    cout << "I am a program to display a date in the form MM-DD-YYYY." << endl;

    int month;
    int day;
    int year;

    cout << "Please enter a Month (1 - 12): ";
    cin >> month;

    cout << "Please enter a Day (1 - 31): ";
    cin >> day;

    cout << "Please enter a four digit year: " << endl;
    cin >> year;

    cout << "You entered " << month << "-" << day << "-" << year << endl;

    return 0;
}