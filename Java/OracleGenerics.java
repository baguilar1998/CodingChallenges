class OracleGenerics {

  #Swaps 2 elements in an array with the use of generics
  public static <T> void swapElements(T [] list,int pos1,int pos2){
    if(pos1<0 || pos1>list.length-1)throw new IllegalArgumentException("Invalid Positions"); 
    if(pos2<0 || pos2>list.length-1)throw new IllegalArgumentException("Invalid Positions"); 
    T temp = list[pos1];
    list[pos1] = list[pos2];
    list[pos2]=temp;
  }

  public static void main(String[] args) {
    Integer arr[] = {1,2,3,4,5};
    
    for(int i = 0; i<arr.length;++i){
      System.out.print(arr[i] + " ");
    }
    
    System.out.println();

    swapElements(arr,-1,4);

    for(int i = 0; i<arr.length;++i){
      System.out.print(arr[i] + " ");
    }

  }
  
}
