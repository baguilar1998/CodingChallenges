import java.util.Scanner;
import java.util.StringTokenizer;
public class Program
{
    
    public static int wordFrequencyCounter(String sentence, String word){
        int counter=0;
        StringTokenizer s = new StringTokenizer(sentence);
        while(s.hasMoreTokens()){
            if (s.nextToken().equals(word))++counter;
        }
        return counter;
    }
    
	public static void main(String[] args) {
	    String sentence,word;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter in a sentence: ");
		sentence = sc.nextLine();
		System.out.println(sentence);
		
		System.out.print("Enter in a word: ");
		word = sc.nextLine();
		System.out.println(word);
		
		System.out.println(wordFrequencyCounter(sentence,word));
	}
}