class Pancakes {
  public static void main(String[] args) {
    pancakes p = new pancakes();

    int stackIndex=0,revolutions=1;
    long diner=0L;
    while(stackIndex != p.GetStackSize()){
        if(diner==p.GetNumDiners()){
            diner=0L;
            ++revolutions;
        }

        if(p.GetStackItem(stackIndex) == diner){
          stackIndex++;
        }else{
          diner++;
        }

    }

    System.out.println(revolutions);

  }
}
class pancakes {
  public pancakes() {
  }

  public static long GetStackSize() {
    return 7L;
  }

  public static long GetNumDiners() {
    return 5L;
  }

  public static long GetStackItem(long i) {
    switch ((int)i) {
      case 0: return 0L;
      case 1: return 1L;
      case 2: return 3L;
      case 3: return 2L;
      case 4: return 1L;
      case 5: return 3L;
      case 6: return 0L;
      default: throw new IllegalArgumentException("Invalid argument");
    }
  }
}