#include <iostream>
using namespace std;

// To execute C++, please define "int main()"

/**
*  Implement a function to reverse an array
*  without using another array at all
*  @param arr an interger arr
*  @param n the size of the array
*/
void reverse(int arr[], int n){
  for(int i=0;i<(n-1)/2;++i){
    int index = (n-1)-i;
    int temp = arr[i];
    arr[i] = arr[index];
    arr[index] = temp;
  }
}

int main() {
 
  int arr [] = {1,2,3,4,5,6,7,8,9,10,11};
  reverse(arr,11);
  for(int i=0;i<11;++i)cout<<arr[i]<< " ";
  return 0;
}
