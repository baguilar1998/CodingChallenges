class Binary{ 
 /**
  * Add two binary numbers given that they are represented
  * as two arrays
  * @param a a binary number 
  * @param b a binary number
  * @return the sum of the two binary numbers
  */
  public static int [] addBinary(int [] a, int [] b) throws Exception {
    if(a.length != b.length) {
      throw new Exception("Binary numbers do not have the same number of bits");
    }
    int sum [] = new int[a.length+1];
    int j = sum.length-1;
    int i = a.length-1;
    int remainder =0;
    while(j>1 || i>=0){
      int digit = a[i]+b[i]+remainder;
      remainder = digit/2;
      int binaryDigit = digit%2;
      sum[j] = binaryDigit;
      i--;
      j--;
    }
    sum[0]=remainder;
    return sum;
  }

 /**
  * Convert a binary number into it's base 10 value
  * @param a an array representing a binary number
  * @return the base 10 value of that binary number
  */
  public static int binaryToDecimal(int [] a) {
    int sum = 0;
    for(int i=0; i < a.length; i ++) {
      if(a[i]==1){
        int powerOfTwo = 1;
        for(int j=a.length-1-i;j>=1;j--)powerOfTwo*=2;
        sum+=powerOfTwo;
      }
    }
    return sum;
  }

}