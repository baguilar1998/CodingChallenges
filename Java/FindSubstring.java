
class FingSubstring {

    public ArrayList<String> combinations(String root, String [] arr, int len){
        ArrayList<String> list = new ArrayList<String>();
        if(len != 1){
            for(int i=0;i<arr.length;++i){
                  if(arr[i].length()>root.length()){
                    --len;
                     ArrayList<String> possibleCombos = combinations(root+arr[i],arr,len);
                    list.addAll(possibleCombos);
                    ++len;   
                  }else if(arr[i].equals(root.substring(0,arr[i].length())))continue;   
                else{
                  --len;
                  ArrayList<String> possibleCombos = combinations(root+arr[i],arr,len);
                  list.addAll(possibleCombos);
                  ++len;   
                   
                }
            }
        }else{
            list.add(root);
        }
        
        return list;
    }
    
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> start =  new ArrayList<Integer>();
        if(s.length()==0 || words.length == 0) return start;
        
        ArrayList<String> combos = new ArrayList<String>();
        int length=0;
        for(int i=0; i< words.length; ++i) length++;
        // Gets all possible orders of the string
       for(int i=0;i<words.length;++i){
           /* String temp = words[i];
            for(int j=0;j<words.length;++j){
                if(words[i]==words[j])continue;
                temp+=words[j];
            }
            combos.add(temp);*/
            combos.addAll(combinations(words[i],words,length));
        }
        //System.out.println(combos);
        
        if(combos.size()==0)return start;
        //Checks to see if the strings match
        int startIndex =0, endIndex=combos.get(0).length();
        while(startIndex < s.length() && endIndex <= s.length()){
            String temp = s.substring(startIndex,endIndex);
            for(int i = 0 ; i< combos.size();++i){
                if(temp.equals(combos.get(i))){
                   start.add(startIndex);
                   break;
                }
            }
            ++startIndex;
            ++endIndex;
        }
        
        
        
        return start;
    }
}