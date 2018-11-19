import java.io.*;
import java.util.*;

class ResultCombinations{
  
  /*
  * Given 2 integers A and B. Only using +,-
  * or no operator, find how many combinations
  * of A result in B
  * Say A is 12345 and B is 168: 123+45 = 168, so that
  * counts as a solution, but 123-45 does not.
  */
  public static int resultCombinations(int A, int B){
    int tempNum = A%10;
    int tempA = A/10;
    int ans = 0;
    if(A==B)++ans;
    int i = 10;
    while(tempA !=0 ){
      if(tempA+tempNum == B)++ans;
      if(tempA - tempNum == B) ++ans;
      tempNum = (tempA%10)*i + tempNum;
      tempA = tempA/10;
      i*=10;
    }
    return ans;
  }
  
  public static void main(String[] args){
    System.out.println(resultCombinations(12345,168));
  }
}

