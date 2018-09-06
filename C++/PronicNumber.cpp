#include <iostream>
using namespace std;

bool pronicNumber(int number){
    static int x=1;
    //Formula for a pronic number
    int n = x*(x+1);
    
    if(number==n) return true;
    else if(number < n) return false;
    ++x;
    
    return pronicNumber(number);
}

int main() {
    int number;
    
    //Asks the user for input
    cout<<"Enter in a number: ";
    cin>>number;
    
    //Checks to see if number is a pronicNumber
    if(pronicNumber(number))cout<<"This is a pronic number";
    else cout<<"This is not a pronic number";
	
	return 0;
}