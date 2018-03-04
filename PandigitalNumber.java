import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Program
{
    public static boolean isPandigitalNumber(String number,Map numberCounter){
        if(number.substring(0,1).equals("0")) return false;
        
        for(int i=0;i<number.length();++i){
            int currentNum = Integer.parseInt(number.substring(i,i+1));
            if(!numberCounter.containsKey(currentNum)){
                numberCounter.put(currentNum,1);
            }else if(numberCounter.containsKey(currentNum)){
                int updateCount =(Integer) numberCounter.get(currentNum);
                numberCounter.replace(currentNum,++updateCount);
            }
        }
        
     
        if(numberCounter.size()==10)return true;
        return false;
            
    }
    
    public static void displayNumberOfOccureneces(Map numberCounter){
        for(int i=0;i<numberCounter.size();++i){
            System.out.println(""+i+" occured "+numberCounter.get(i)+" time(s).");
        }
    }
    
	public static void main(String[] args) {
		Map<Integer,Integer> numberCounter = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		String number;
		
		System.out.print("Enter in a number: ");
		number = sc.nextLine();
		System.out.println(number);

		
		if(isPandigitalNumber(number,numberCounter)){
		    System.out.println("This is a pandigital number");
		    displayNumberOfOccureneces(numberCounter);
		}else{
		    System.out.println("This is not a pandigital number");
		}
	}
}