
class FirstNonDuplicated{

    /**
     * A function that finds the first non-duplicate 
     * character in a string
     * @param s a string
     * @return the first non-duplicate character
     */
    public char firstNonDuplicated(String s){
        Queue<Character> q = new LinkedList<Character>();
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();

        // Counts the number of characters in the string
        // And store each character of the string in a queue
        for(int i=0; i<s.length();i++){
            q.add(s.charAt(i));
            if(!h.containsKey(s.charAt(i))) h.add(s.charAt(i),1);
            else{
                int v = h.get(s.charAt(i));
                h.replace(s.charAt(i),++v);
            }
        }

        // Dequeue until the first character key value in 
        // the hash map is equal to 1
        for(int i=0;i<s.length();++i){
            char c = q.remove();
            if(h.get(c)==1)return c;
        }

        return  '\u0000';
    }
}