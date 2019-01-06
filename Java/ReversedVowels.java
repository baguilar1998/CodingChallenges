class ReversedVowels {
    public boolean isVowel(char c){
        char vowel = Character.toLowerCase(c);
        switch(vowel){
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                break;
        }
        return false;
        
    }
    public String reverseVowels(String s) {
        if(s.length()<=1)return s;
        String reversedVowel = "";
        for(int i=s.length()-1;i>=0;--i){
            char c = s.charAt(i);
            if(isVowel(c))reversedVowel+=c;
        }
        String answer = "";
        for(int i=0,j=0;i<s.length();++i){
            char c = s.charAt(i);
            if(isVowel(c)){
                answer+=reversedVowel.charAt(j);
                ++j;
            }else{
                answer+=c;
            }
        }
        return answer;
    }
}