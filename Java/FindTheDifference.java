class FindTheDifference {
    public char findTheDifference(String s, String t) {
        
        char ans = ' ' ;
        
        HashMap<Character,Integer> set1 = new HashMap<Character,Integer>();
        HashMap<Character, Integer> set2 = new HashMap<Character,Integer>();
        
        
        for(int i=0; i<s.length();++i) {
            if(!set1.containsKey(s.charAt(i))){
                set1.put(s.charAt(i),1);
            }else{
                int temp = set1.get(s.charAt(i));
                set1.replace(s.charAt(i),++temp);
            }
            
        }
        
        
        for(int i=0; i<t.length();++i) {
            if(!set2.containsKey(t.charAt(i))){
                set2.put(t.charAt(i),1);
            }else{
                int temp = set2.get(t.charAt(i));
                set2.replace(t.charAt(i),++temp);
            }
            
        }

        for(int i=0;i<t.length();++i){
            if(!set1.containsKey(t.charAt(i))){
                ans=t.charAt(i);
                break;
            }else if (set1.get(t.charAt(i)) != set2.get(t.charAt(i))){
                ans=t.charAt(i);
                break;
            }
        }
        
        
        return ans;
    }
}