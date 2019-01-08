#include <iostream>
#include <cstdlib>
using namespace std;

void initialPrompt(string &name, int &totRounds){
	cout << "Enter contestant name: ";
	cin >> name;

	cout << "How many rounds do you want to play? ";
	cin >> totRounds;

	cout << name << ", welcome to Let's Make a Deal!" << endl;

}

void swapDoors(char &answer, int &playerDoor, int &remainingDoor){
	cout << "Would you like to swap door " << playerDoor << " for door " << remainingDoor << "? (Y/N): ";
	cin >> answer;

	if(answer == 'Y'){
		playerDoor = remainingDoor;
	}
}

void promptSwap(int playerDoor, int winnerDoor){
	int revealedDoor = (rand() % 3) + 1;
	while(revealedDoor == playerDoor || revealedDoor == winnerDoor){
		revealedDoor = (rand() % 3) + 1;
	}

	cout << "Door number " << revealedDoor << " has a goat!" << endl;

	int remainingDoor = 6 - playerDoor - revealedDoor;
	char answer;

	swapDoors(answer, playerDoor, remainingDoor);
}


void playGame(int roundNum, int &numWins){
	int winnerDoor = (rand() % 3) + 1;
	int playerDoor;
	cout << "Round " << roundNum << ": Would you like door 1, 2, or 3? ";
	cin >> playerDoor;

	promptSwap(playerDoor, winnerDoor);
	cout << "The winning door was door " << winnerDoor << endl;

	if(winnerDoor == playerDoor){
		cout << "You win!" << endl;
		numWins = numWins + 1;
	}

	else{
		cout << "Better luck next time!" << endl;
	}


}

//Main function goes here
int main(){
	srand(time(NULL));

	int numWins = 0;
	int roundNum;
	string name;
	int totRounds;

	
	initialPrompt(name, totRounds);

	for(int i = 1; i <= totRounds; ++i){
		roundNum = i;
		playGame(roundNum, numWins);
		
	}

	cout << name << " won "<< numWins << " out of "<< totRounds<< " rounds." << endl;
	

}