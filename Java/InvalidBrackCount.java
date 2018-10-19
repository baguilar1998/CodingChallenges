class InvalidBrackCount{
    // Given a parentheses string, return the minimum number of parentheses 
    // we must add to make the resulting string valid.
    public int minAddToMakeValid(String S) {
        if(S.length() == 0) return 0;
        Stack<Character> s = new Stack<Character>();
        int count =0;
        for(int i=0;i<S.length();++i){
            if(S.charAt(i)=='('){
                s.push('(');
            } else if(S.charAt(i) ==')'){
                if(s.empty()){
                    s.push(S.charAt(i));
                    continue;
                }
                if(s.peek()!='(') s.push(')');
                else {char g = s.pop();}
            }
        }
        return s.size();
    }
}
}