import java.io.*;
import java.util.*;

class DotProduct{
  public static int dotProduct(int [] u , int [] v) throws Exception{
    if(u.length != v.length) throw new Exception("Not Valid Vectors");
    int result=0;
    for(int i=0; i < u.length; ++i){
      result += u[i]*v[i];
    }
    return result;
  }
  public static void main(String[] args){
    int a [] ={1,2,3};
    int b [] = {3,2,1};
    try{
      System.out.println(dotProduct(a,b));
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}

