#include <iostream>
#include <fstream>
using namespace std;

// Returns an string of asterisks with length numAsterisks
string createAsterisksWord(int numAsterisks)
{
	// a. Initialize empty string
	string asterisksWord;

	// b. for the numAsterisks passed in
		for(int i = 0; i < numAsterisks; ++i){

		// i.	concatenate an asterisk to our string
		asterisksWord += "*";
		}
	return asterisksWord;
}

// Replaces any occurrence of censorWord in sentence with asterisks
void censorSentence(string censorWord, string& sentence)
{
	// a. Create a replacement word variable
	string replacementWord;
	replacementWord =  createAsterisksWord(censorWord.size());

	// b. While the censorword is in the sentence
	while((sentence.find(censorWord)) != sentence.npos ){
		// i.	Find it
		int loc = sentence.find(censorWord);

		int len = censorWord.size();

		// ii.	Replace it
		sentence.replace(loc, len, replacementWord);
	}

	return;
}

int main() {
	// a. Prompt user to input censorWord
	string censorWord;
	string filename;

	cout << "Enter the censor word(s): ";
	getline(cin, censorWord);

	// b. Prompt user to input filename to read from
	cout << "Enter the file to read from: ";
	cin >> filename;

	// c. Open the file
	ifstream inFile(filename);

	// d. Make sure the file open was successful
	inFile.is_open();

	// e.  i. 	Iteratively read each line in the file
	string sentence;
	while(getline(inFile, sentence)){

		// ii. 	Censor the sentence you read
		censorSentence(censorWord, sentence);

		// iii.	Print the censored sentence to the terminal
		cout << sentence << endl;
	}

	inFile.close();

	return 0;
}