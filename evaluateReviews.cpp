//Name:Lauren Stanciel
//Uniquename: stanciel, none
//UMID: 38206582
//Section: 035
//Date: 11/27/18

// Add any #includes for C++ libraries here.
// We have already included iostream as an example.
#include <iostream>
#include <fstream>
#include <string>
#include <vector>
// The #include adds all the function declarations (a.k.a. prototypes) from the
// reviews.h file, which means the compiler knows about them when it is compiling
// the main function below (e.g. it can verify the parameter types and return types
// of the function declarations match the way those functions are used in main() ).
// However, the #include does not add the actual code for the functions, which is
// in reviews.cpp. This means you need to compile with a g++ command including both
// .cpp source files. For this project, we will being using some features from C++11,
// which requires an additional flag. Compile with this command:
//     g++ --std=c++11 evaluateReviews.cpp reviews.cpp -o evaluateReviews
#include "reviews.h"

using namespace std;

const double SCORE_LIMIT_TRUTHFUL = 3;
const double SCORE_LIMIT_DECEPTIVE = -3;


int main(){
//Define all variables    
string evaluate;
int truthful = 0;
int deceptive = 0;
int uncategorized = 0;
double highestReviewScore = 0.0;
double lowestReviewScore = 0.0;
int highestReview = 0;
int lowestReview = 0;
int n = 0;
int totalReviews = 0;

//Create new file to work with
ofstream reviewsFile("report.txt");
reviewsFile << "review " << "score "<< "category"<< endl;

//Open keywordWeights.txt and check that it actually got opened, if not end program
ifstream keywordWeights("keywordWeights.txt");
if(!keywordWeights.is_open()){
    cout << "Error: keywordWeights.txt could not be opened."<< endl;
    return 1;
}

vector<double> weights;
vector<string> keywords;
readKeywordWeights(keywordWeights, keywords, weights);

while(n < 100){
    ifstream reviews(makeReviewFilename(n));

    if(reviews.is_open()){

// Reads in a review from an input stream and stores each individual word from the review
// into the vector reviewWords
vector<string> reviewWords;
readReview(reviews, reviewWords);


//Creates a variable for reviewScore to evaluate the type of review it is
double totalScore = reviewScore(reviewWords, keywords, weights);

//Determines if the function is truthful
if(totalScore > SCORE_LIMIT_TRUTHFUL){
    evaluate = " truthful";
    ++truthful;
}

//Determines if the function is deceptive
if(totalScore < SCORE_LIMIT_DECEPTIVE){
    evaluate = " deceptive";
    ++deceptive;
}

//Determines if the function is uncategorized
if(totalScore <= SCORE_LIMIT_TRUTHFUL && totalScore >= SCORE_LIMIT_DECEPTIVE){
    evaluate = " uncategorized";
    ++uncategorized;
}

//Determines if the totalScore is the highest review score
if( totalScore > highestReviewScore){
    highestReviewScore = totalScore;
    highestReview = n;
}

//Determines if the totalScore is the lowest review score
if(totalScore < lowestReviewScore){
    lowestReviewScore = totalScore;
    lowestReview = n;
}

//Reads out the reviews
reviewsFile << n << " " << totalScore << evaluate << endl;

//Counts the number of reviews
++totalReviews;

}
//Counts the number of files
++n;
}

//Reads out the results
reviewsFile << " " << endl;
reviewsFile << "Number of reviews: " << totalReviews << endl;
reviewsFile << "Number of truthful reviews: " << truthful << endl;
reviewsFile << "Number of deceptive reviews: " << deceptive << endl;
reviewsFile << "Number of uncategorized reviews: " << uncategorized << endl;
reviewsFile << " " << endl;
reviewsFile << "Review with highest score: "<< highestReview << endl;
reviewsFile << "Review with lowest score: "<< lowestReview << endl;


}


