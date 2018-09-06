class LicenseKeyCorrector {
    public String solution(String S, int K) {
        // write your code in Java SE 8
        String replacement = "", answer="";
        
        for(int i=0;i<S.length();++i){
           if(S.charAt(i)!='-') replacement += S.charAt(i)+""; 
        }
        
        int count=0;
        for(int i=replacement.length()-1;i>=0;--i){
            if(count==K){
                answer = "-"+answer;
                count=0;
            }
            if(replacement.charAt(i)>='A' && replacement.charAt(i)<='Z' || replacement.charAt(i)>='0'  && replacement.charAt(i)<='9'){
                answer = replacement.charAt(i)+""+answer;
                 ++count;
            } else{
                //answer = ((char)(replacement.charAt(i)+32))+""+answer;
                char letter =replacement.charAt(i);
                answer = Character.toUpperCase(letter)+""+answer;
                ++count; 
            }
        }
        
        return answer;
    }
}
