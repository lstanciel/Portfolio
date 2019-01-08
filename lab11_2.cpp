#include <iostream>
#include <fstream>
#include <string>
#include <vector>
using namespace std;

struct Student{
    string first_name;
    string last_name;
    double gpa;
    string favorite_color;
    int is_in_state_student;
};

string questionOne(vector<Student> studentData){
    double highestGPA;
    int place;
    for(int i = 0; i < studentData.size(); ++i){
        if(highestGPA < studentData.at(i).gpa){
            highestGPA = studentData.at(i).gpa;
            place = i;

        }
    }
    return studentData.at(place).first_name;
}


int questionTwo(vector<Student> studentData){
    int total = 0;
    for(int i = 0; i < studentData.size(); ++i){
        total += studentData.at(i).is_in_state_student;
    }
    return total;
}

double questionThree(vector<Student> studentData){
    double sum;
    double average;

    for(int i = 0; i < studentData.size(); ++i){
        sum += studentData.at(i).gpa;
    }

    average = sum/studentData.size();

    return average;
}

bool questionFour(vector<Student> studentData){
    int result;
    for(int i = 0; i < studentData.size(); ++i){
        if(studentData.at(i).is_in_state_student == 1){
            if(studentData.at(i).favorite_color == "red" ){
                ++result;
            }
        }
    }

    if(result > 0){
        return true;
    }
    
    else{
        return false;
    }       
}

int main(){
    vector<Student> umichStudent;
    
    ifstream inFile("class_info.txt");
    Student tempStudent;
    while(inFile >> tempStudent.first_name >> tempStudent.last_name >> tempStudent.gpa >> tempStudent.favorite_color >> tempStudent.is_in_state_student){
        umichStudent.push_back(tempStudent);
    }
  
    string answerOne = questionOne(umichStudent);
    cout << "Q1: " << answerOne << endl;

    int answerTwo = questionTwo(umichStudent);
    cout << "Q2: " << answerTwo << endl;

    double answerThree = questionThree(umichStudent);
    cout << "Q3: " << answerThree << endl;

    bool answerFour = questionFour(umichStudent);
    cout << "Q4: " << answerFour << endl;




    

}