class Solution {
    /*
    Given a non-negative integer num, 
    repeatedly add all its digits until the result
    has only one digit.
    
    Example:
    Input: 38
    Output: 2 
    Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
    Since 2 has only one digit, return it.
    */
    public int addDigits(int num) {
        
        if(num < 10 )return num;
        
        ArrayList<Integer> seperateNums = new ArrayList<Integer>();
        
        while(num!=0){
            seperateNums.add(num%10);
            num/=10;
        }
        
        int sum =0;
        
        for(Integer i : seperateNums) sum+=i;
        
        return addDigits(sum);
        
    }
}