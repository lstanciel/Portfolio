#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

int sumMatrix(const vector< vector<int> > &matrix){
    int sum = 0;
    for(int row = 0; row < matrix.size(); ++row){
        for(int col = 0; col < matrix.at(row).size(); ++col){
            sum += matrix.at(row).at(col);
        }
    }
    return sum;
}

void printMatrix(const vector< vector<int> > &matrix){
    for(int row = 0; row < matrix.size(); ++row){
        for(int col = 0; col < matrix.at(row).size(); ++col){
            cout << matrix.at(row).at(col);
        }
        cout << endl;
    }
}

vector< vector<int> > createTimesGrid(string person){
    if(person == "Neil"){
    vector<int> neilMatrix(5, 25);
    vector< vector<int> > neilTimes(5, neilMatrix);
    neilTimes.at(2).at(2) = 50;
    neilTimes.at(3).at(1) = 50;

    return neilTimes;
    }

    else{
    vector<int> rowOne(5, 30);
    vector<int> rowTwo(5, 20);
    vector<int> rowThree(5, 10);
    vector< vector<int> > aaronTimes;
    aaronTimes.push_back(rowOne);
    aaronTimes.push_back(rowTwo);
    aaronTimes.push_back(rowThree);
    aaronTimes.push_back(rowTwo);
    aaronTimes.push_back(rowOne);

    return aaronTimes;
    }
    

    
}

int main(){
    cout << "Neil's Times:" << endl;
    vector< vector<int> > neilTimes = createTimesGrid("Neil");  
    printMatrix(neilTimes);

    cout << "Aaron's Times:" << endl;
    vector< vector<int> > aaronTimes  = createTimesGrid("Aaron"); 
    printMatrix(aaronTimes);
    
    cout << "Neil took "<< sumMatrix(neilTimes) << " minutes to clear the snow." << endl;
   
    cout << "Aaron took "<< sumMatrix(aaronTimes) << " minutes to clear the snow." << endl;


}