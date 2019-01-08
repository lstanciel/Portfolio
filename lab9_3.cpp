// TODO: include libraries (like fstream!)
#include <fstream>
#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    // Create and open filestreams
    ifstream inFile("grades280.txt");
    ofstream outFile("finalGrades280.txt");

    // Create variables for the header of our file (eg. course, month, ...)
    string course;
    int month;
    int day;
    int year;

    // Read in the header of our file
    inFile >> course >> month >> day >> year; 

    // Output the header to our output file
    outFile << course << " " << "(" << month << "/" << day << "/" << year << ")" << endl;

    // Create variables for the data within a row of the file
    double p1;
    double p2;
    double p3;
    double e1;
    double e2;
    double finalGrade;

    // Read in rows from the file
    while(inFile >> p1 >> p2 >> p3 >> e1 >> e2)
    {
        // Calculate the final grade
        finalGrade = (((p1 + p2 + p3)/75)*40) + (((e1+e2)/200)*60);

        // Output the final grade to the output file
        outFile << finalGrade << endl;
    }

    // Close filestreams
    inFile.close();
    outFile.close();
}