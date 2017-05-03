class Suit {
  final static int CLUBS = 1;
  final static int HEARTS = 2;
  final static int SPADES = 3;
  final static int DIAMONDS = 4;
}

enum Suit2 { CLUBS, DIAMONDS, SPADES, HEARTS}

class Fibonacci2 {
    static final int MAX = 50;
    /** Print the Fibonacci sequence for values < MAX */
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        while (hi < MAX) {
            System.out.println(hi);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
