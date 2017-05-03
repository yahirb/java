class Fibonacci {
  public static void main(String [] args) {
    // This is my first sequence, Fibonacci
    int lo = 1;
    int hi = 1;
    System.out.println("This is my title for the Fibonacci Sequence.");
    System.out.println(lo);
    while(hi < 50) {
      System.out.println(hi);
      hi = lo + hi;
      lo = hi - lo;
    }
    // This is my second sequences
    int first = 1;
    int second = 2;
    System.out.println("This is my second sequence: ");
    System.out.println(first);
    while(second < 100){
      System.out.println(second);
      second = first * second;
      first = second / first;
    }
  }
}
