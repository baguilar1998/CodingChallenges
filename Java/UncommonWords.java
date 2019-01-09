class UncommonWords {
    
    public void addWord(String key,HashMap<String,Integer> words){
        if(!words.containsKey(key)){
            words.put(key,1);
        }else{
            int newVal = words.get(key)+1;
            words.replace(key,newVal);
        }
    }
    
   
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String,Integer> words = new HashMap<>();
        String [] s1 = A.split(" ");
        String [] s2 = B.split(" ");
        
        for(int i=0; i < s1.length; ++i){
            addWord(s1[i],words);
        }
        
        for(int i=0; i<s2.length; ++i){
            addWord(s2[i],words);
        }
        
        HashSet<String> uniqueWords = new HashSet<>();
        for(String key : words.keySet()){
            if(words.get(key) == 1) uniqueWords.add(key);
        }
        
        String [] answer = new String[uniqueWords.size()];
        int index = 0;
        for(String word : uniqueWords){
            answer[index++]=word;
        }
        
        return answer;
    }
}