/**
 * @uniqname: stanciel
 * @date: 11/20/18
 * @lab-section: 035
 *
 * PURPOSE:
 * Complete the functions below.
 * These are useful string and vector manipulation functions.
 */
#include <iostream>
#include <string>
#include <vector>
using namespace std;

/*
    Purpose:
        Print all the elements of the vector, separated by spaces.
    Example:
        If the input vector was [3, 4, 5], this function would output: 3 4 5
*/
void printIntVector(vector<int> & numbers){
    for(int i = 0; i < numbers.size(); ++i){
        cout << numbers[i] << " ";
    }
}


/*
    Purpose:
        Calculate the mean (or average) of a vector
    Example:
        If the input vector was [3, 4, 5], this function will return: 4
*/
double mean(vector<int> & numbers){
    double total = 0;
    double mean;
    for(int i = 0; i < numbers.size(); ++i){
        total += numbers[i];
    }
    mean = total/(numbers.size());
    return mean;
}


/*
    Purpose:
        Count the number of elements in the vector greater than the queryValue.
        Do not count elements equal to the query value
    Example:
        If the input vector was [10, 5, 8] and the query value was 6,
        this function will return: 2
*/
int numElementsGreaterThan(vector<int> & numbers, int queryValue) {
    int greaterThan = 0;
    for(int i = 0; i < numbers.size(); ++i){
        if(numbers[i] > queryValue){
            greaterThan += 1; 
        }
    }
    return greaterThan;
}


/*
    Purpose:
        Count the number of times the letter is in the word.
        This function is case sensitive (eg. treat 'T' and 't' as different chars)
    Example:
        If the input string was "test" and the input char was 't',
        the function will return: 2
*/
int countLetters(string word, char letter){
    int count = 0;
    int total;
    for(int i = 0; i < word.size(); ++i){
        if(word.at(i) == letter){
            count++;
        }
    }
    total = count;
    return total;
}



/*
    Purpose:
        Return the reverse of the input string
    Example:
        If the input string was "loop", the function will return: "pool"
*/
string reverseString(string word) {
    int len = word.length();
    string reverse;
    for(int i = 0; i < len/2; ++i){
        swap(word[i], word[len-i-1]);
    }
    reverse = word;

    return reverse;
}


// The test code below has been implemented for you
// ----------------------------------------------------------------------------
vector<int> createTestVector() {
    vector<int> sampleNumbers;
    sampleNumbers.push_back(5);
    sampleNumbers.push_back(12);
    sampleNumbers.push_back(6);
    sampleNumbers.push_back(30);
    sampleNumbers.push_back(19);
    return sampleNumbers;    
}

int main() {
    vector<int> testVector = createTestVector();
    string testString = "Sammy sells seashells";

    cout << "Test 1: Printing the vector" << endl;
    cout << "Yours:   ";
    printIntVector(testVector);
    cout << "Correct: " << "5 12 6 30 19" << endl << endl;

    cout << "Test 2: Mean" << endl;
    cout << "Yours:   " << mean(testVector) << endl;
    cout << "Correct: " << 14.4 << endl << endl;

    cout << "Test 3: Count of elements greater than 10" << endl;
    cout << "Yours:   " << numElementsGreaterThan(testVector, 10) << endl;
    cout << "Correct: " << 3 << endl << endl;

    cout << "Test 4: Counter of letter s" << endl;
    cout << "Yours:   " << countLetters(testString, 's') << endl;
    cout << "Correct: " << 5 << endl << endl;    

    cout << "Test 5: Reversed string" << endl;
    cout << "Yours:   " << reverseString(testString) << endl;
    cout << "Correct: " << "sllehsaes slles ymmaS" << endl;
}
// ----------------------------------------------------------------------------
