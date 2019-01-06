class Anagram{
    public static boolean isAnagram(String input1, String input2) {
        if(input1 == null || input2 == null)return false;
        if(input1.length()!=input2.length())return false;
    
        for(int i=0;i<input1.length();++i){
            char c = input1.charAt(i);
            if(input2.indexOf(c)==-1)return false;
        }
        return true;
    }
}