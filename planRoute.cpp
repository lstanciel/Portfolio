#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <cmath>

using namespace std;

//Create a struct for planetary data
struct planet{
    int planetRow;
    int planetCol;
    string planetSymbol;
	int planetID;
	string planetName;
    bool visited;
    
};

//Fixes the errors in the planet names.
//Replaces "XX" with nothing, it erases it and replace "_" with " ".
vector<planet> correctErrors(vector<planet> data){
	string x;
	x = "XX";
	string underscore;
	underscore = "_";
	string result; 
	//Finds and replaces the XX in a planet name
	for(int i = 0; i < data.size(); ++i){
	while(data.at(i).planetName.find("XX") != data.at(i).planetName.npos){
		int loc = data.at(i).planetName.find("XX");
		int len = x.size();

		 data.at(i).planetName = data.at(i).planetName.replace(loc, len, "");
	}

	//Finds and replaces the _ in a planet name
	while(data.at(i).planetName.find("_")!= data.at(i).planetName.npos){
		int locat = data.at(i).planetName.find("_");
		int length = underscore.size();
		
		data.at(i).planetName = data.at(i).planetName.replace(locat, length, " ");
		
	}
	//Redefines the planetName in the struct so that it is the version without errors
	result = data.at(i).planetName;
}
return data;
}

//It creates a grid of symbols with the starting point, ending point, and planet symbols showing us where everything is.
vector< vector<string> > createLocationGrid(vector<planet> data, int startingRow, int startingCol, int endingRow, int endingCol, int numberGridRows, int numberGridCols){

//Create matrix locationGrid full of "."
vector<string> rows(numberGridCols, ".");
vector< vector<string> > locationGrid(numberGridRows, vector<string>(rows));

//Labels the start and end points with the correct symbols
locationGrid.at(startingRow).at(startingCol) = "S";
locationGrid.at(endingRow).at(endingCol) = "E";

//Goes through the planets and finds their locations, then labels those points with planet symbols in the grid 
for(int i = 0; i < data.size(); ++i){
locationGrid.at(data.at(i).planetRow).at(data.at(i).planetCol) = data.at(i).planetSymbol;
}

return locationGrid;
}

//Finds the next planet in the route
planet nextStep(vector<planet> &data, int startingRow, int startingCol, int endingRow, int endingCol, int numberGridRows, int numberGridCols){
double distance = 0;
planet result;
double bestDistance = 10000000;
int bestIndex = 0;

//Looks through all of the planets
for(int i = 0; i < data.size(); ++i){
	//Checks if the planet has been checked and is within the given start and end range.
		
		//Calculates the distance from the starting point to the planet
		distance = sqrt(pow((startingRow - data.at(i).planetRow), 2)+ pow((startingCol - data.at(i).planetCol), 2));

		//Checks if the planet being checked is closer than the current closest planet
		if(distance < bestDistance && data.at(i).visited == false){
			bestDistance = distance;
			result = data.at(i);
			bestIndex = i;
		}
		
		//Determines the best planet based on ID if they are equal distance from the starting point or last planet
		if(distance == bestDistance && data.at(i).visited == false){
			if(data.at(i).planetID < result.planetID){
				bestDistance = distance;
				result = data.at(i);
				bestIndex = i;
			}
		}
		
	}
	data.at(bestIndex).visited = true;
return result;
}


int main(){
int numberGridRows;
int numberGridCols;
int startingRow;
int startingCol;
int endingRow;
int endingCol;

string loc;
string namesFile;
//Prompt the user to input two filenames
cout << "Enter Locations Filename: ";
cin >> loc;
cout << "Enter Names Filename: ";
cin >> namesFile;

//Input files and check if they actually opened
//Exit program if they didn’t open
ifstream locations(loc);
ifstream names(namesFile);

if(!locations.is_open() || !names.is_open()){
    cout << "Input file could not be opened" << endl;
    return 1;
}

//Read in coordinate variables from locations
locations >> numberGridRows;
locations >> numberGridCols;
locations >> startingRow;
locations >> startingCol;
locations >> endingRow;
locations >> endingCol;

//Redefine the variables to take into account the fact that the numbers are grid cooridinates not indexing numbers
int startR = startingRow;
int startC = startingCol;
int endR = endingRow;
int endC = endingCol;
startingRow = startingRow-1;
startingCol = startingCol-1;
endingRow = endingRow-1;
endingCol = endingCol-1;

//Create a vector of structs
vector<planet> planetsData;
planet tempPlanet;
vector<planet> fullplanetsData;
//Read in the files to the vector 

//Reads in all of the data including the out of range stuff 
while(locations >> tempPlanet.planetRow >> tempPlanet.planetCol >> tempPlanet.planetSymbol >> tempPlanet.planetID){
	fullplanetsData.push_back(tempPlanet);	
}

//Adds the parts read in from the name file to the struct vector
while(names >> tempPlanet.planetID >> tempPlanet.planetName){
	for(int i = 0; i < fullplanetsData.size(); ++i){
		if(fullplanetsData.at(i).planetID == tempPlanet.planetID){
			fullplanetsData.at(i).planetName = tempPlanet.planetName; 
		}	
	}
}

//Only reads in the data that is in range
for(int i = 0; i < fullplanetsData.size(); ++i){
    if(fullplanetsData.at(i).planetRow <= numberGridRows && fullplanetsData.at(i).planetCol <= numberGridCols && fullplanetsData.at(i).planetRow > 0 && fullplanetsData.at(i).planetCol > 0){
	planetsData.push_back(fullplanetsData.at(i));
	}
	
}

//Outputs errors for data that is out of range
for(int i = 0; i < fullplanetsData.size(); ++i){
	if(fullplanetsData.at(i).planetRow > numberGridRows || fullplanetsData.at(i).planetRow <= 0 || fullplanetsData.at(i).planetCol > numberGridCols || fullplanetsData.at(i).planetCol <= 0){
		cout << fullplanetsData.at(i).planetID << " " << "out of range - ignoring" << endl;
	}
}


///Redefine the variables to take into account the fact that the numbers are grid cooridinates not indexing numbers
for(int i = 0; i < planetsData.size(); ++i){
	planetsData.at(i).planetRow = planetsData.at(i).planetRow - 1;
	planetsData.at(i).planetCol = planetsData.at(i).planetCol - 1;
	planetsData.at(i).visited = false;
}


//Create output file and output 
ofstream journey("journey.txt");

//Goes through the name files and fixes all of the errors
planetsData = correctErrors(planetsData);

//Uses the information from the location files to construct a grid
vector< vector<string> > grid = createLocationGrid(planetsData, startingRow, startingCol, endingRow, endingCol, numberGridRows, numberGridCols);

//Read out the entire grid into the journey file
for(int row = 0; row < numberGridRows; ++row){
        for(int col = 0; col < numberGridCols; ++col){
            journey << grid.at(row).at(col);
        }
        journey << endl;
    }


//Read out the other information into the journey file
journey << "Start at " << startR << " " <<startC << endl;

//Creates a copy of the starting row and col to edit. 
int srow = startingRow;
int scol = startingCol;

//Reads out each of the differen planet vectors in the correct order to create the optimal path through the grid
for(int i = 0; i < planetsData.size(); ++i){
planet newData = nextStep(planetsData, srow, scol, endingRow, endingCol, numberGridRows, numberGridCols);
journey << "Go to " << newData.planetName << " at " << newData.planetRow+1 << " " << newData.planetCol+1 << endl;
srow = newData.planetRow;
scol = newData.planetCol;

}

journey << "End at " << endR << " " << endC << endl;
//Close all files 
 locations.close();
 names.close();
 journey.close();

}