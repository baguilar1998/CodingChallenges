/**
* Given an array of size n, find the majority element. 
* The majority element is the element that appears more than floor(n/2) times.
* You may assume that the array is non-empty and the majority element always exist in the array.
*/
public class Majority {
	public int majorityElement(final List<Integer> a) {
	    int highestCount = 0, answer = 0;
	    double floorTimes = Math.floor(a.size()/2);
	    HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<a.size();++i){
	        int current = a.get(i);
	        if(!count.containsKey(current)){
	            count.put(current,1);
	        }else{
	            int val = count.get(current);
	            count.replace(current,++val);
	        }
	    }
	    
	    for(int x: count.keySet()){
	        int currentCount = count.get(x);
	        if(currentCount>highestCount){
	            answer = x;
	            highestCount = currentCount;
	        }
	    }
	    
	    return answer;
	}
}