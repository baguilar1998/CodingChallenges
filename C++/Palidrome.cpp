#include <iostream>
#include <string>
using namespace std;

//Determine if a string is a palidrome without using
// extra space. Linear Time. Assume everything is lowecase
bool isPalidrome(string s){
 for(int i=0; i<s.size()/2;i++){
   int index = (s.size()-i)-1;
   if(s[i]!=s[index])return false;
 }
  return true;
}
// To execute C++, please define "int main()"
int main() {
  if(isPalidrome("racecar"))cout<<"true";
  else cout<<"false";
  return 0;
}
