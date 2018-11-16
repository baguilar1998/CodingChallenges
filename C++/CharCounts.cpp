#include <iostream>
#include <fstream>
#include <string>
using namespace std;


int main(int argc, char *argv[]){
	ifstream input (argv[1]);
	ofstream output (argv[2]);
	int index;
	int charCounts[256];
	char charIn;

	for(int i=0; i<256;++i) charCounts[i]=0;

	string line;

	if(input.is_open()) {
		while(getline(input,line)){
			for(int i=0; i<line.length();i++){
				charIn = line[i];
				if(charIn == ' ')continue;
				index = (int)charIn;
				charCounts[index]++;
			}
		}
		input.close();
	}

	if(output.is_open()){
		index = 0;
		while(index < 256){
			if(charCounts[index] > 0)
				output << (char)index <<" "<<charCounts[index]<<"\n";
			++index;
		}
		output.close();
	}

	return 0;
}
