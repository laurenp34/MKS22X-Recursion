public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){

      double percDiff = Math.abs(guess * guess - r) / r;
    if (percDiff < .00001) {
      return guess;
    } else {
      return squareRoot(r, ((r/guess) + guess )/2);
    }
  }

  public static double squareRoot(double r) {
    if (r == 0) {
      return 0;
    } else if (r < 0) {
      return -1;
    }
    return squareRoot(r,1);

    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
    }

}
