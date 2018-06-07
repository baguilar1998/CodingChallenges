import java.util.Queue;
import java.util.LinkedList;
/*
Checks to see that every 2 pairs of digits in between 3 question marks
has a sum of 10
*/
class Question {
  public static boolean QuestionMark(String s){
    Queue<Character> temp = new LinkedList<Character>();
    for(int i=0;i<s.length();++i){
      Character c = s.charAt(i);
      
      if(c=='?' || Character.isDigit(c) ) 
          temp.add(c);
    }

    System.out.println(temp);
    int counter=0;
    int num1=0,num2=0;
    while(temp.size()!=0){
        char first= temp.remove();

        if(Character.isDigit(first) && counter==0){
          num1=(int)first;
          ++counter;
        }
        else if (first=='?' && counter ==0){}
        else if(first=='?' && 0<counter<4)++counter;
        else if (Character.isDigit(first) && 0<counter<4)return false;
        else if(Character.isDigit(first) && counter==4){
          num2=(int)first;
          if(num1+num2==10)return false;
          num1=num2=counter=0;
        }else{
          num1=num2=counter=0;
        }
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(QuestionMark("acc?7??sss?3rr1?????5"));
    System.out.println(QuestionMark("a6?7"));
  }
}