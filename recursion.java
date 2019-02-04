import java.io.*;
import java.util.*;

public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double r, double tolerance){

      if (r == 0) {
        return 0;
      } else if (r < 0) {
        return -1;
      }
      return squareRoot(r,1,tolerance);

      }

    public static double squareRoot(double r, double guess, double tolerance) {
      double percDiff = Math.abs(guess * guess - r) / r;
    if (percDiff < tolerance) {
      return guess;
    } else {
      return squareRoot(r, ((r/guess) + guess )/2, tolerance);
    }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      if (n == 0) {
        return 0;
      } else if (n==1) {
        return 1;
      }
       int[] fibs = new int[n];
       fibs[0] = 1;
       fibs[1] = 1;

       return fib(2, fibs);
    }

    public static int fib(int n, int[] fibs) {
      //System.out.println(Arrays.toString(fibs));

      if (n == fibs.length)  {
        return fibs[n-1];
      }
      fibs[n] = fibs[n-1] + fibs[n-2];
      return fib(n+1,fibs);

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> result = new ArrayList<Integer>();
      result.add(0);

      if (n==0) {
        return result;
      }

      return makeAllSums(1,n,result);
    }

    public static ArrayList<Integer> makeAllSums(int current, int end, ArrayList<Integer> result) {
      if (current > end) {
        return result;
      }
      int size = result.size();
      for (int i=0;i<size;i++) {
        //System.out.println(result);
        result.add(result.get(i));
        result.set(i,result.get(i)+current);
      }
      //result.add(current);
      return makeAllSums(current+1,end,result);


    }

    public static void main(String[] args) {
            System.out.println("sqrt()");
            System.out.println("-----------------------\n");

            System.out.println("sqrt(4, 0.00001)");
            System.out.println("EXPECTED: 2");
            System.out.println(sqrt(4, 0.00001));         // 2

            System.out.println("----");

            System.out.println("sqrt(8, 0.00001)");
            System.out.println("EXPECTED: ~2.8284");
            System.out.println(sqrt(8, 0.00001));         // ~2.8284

            System.out.println("----");

            System.out.println("sqrt(0, 0.00001)");
            System.out.println("EXPECTED: 0");
            System.out.println(sqrt(0, 0.00001));         // 0

            System.out.println("\n");

            System.out.println("fib()");
            System.out.println("-----------------------\n");

            System.out.println("fib(0)");
            System.out.println("EXPECTED: 0");
            System.out.println(fib(0));                   // 0

            System.out.println("----");

            System.out.println("fib(1)");
            System.out.println("EXPECTED: 1");
            System.out.println(fib(1));                   // 1

            System.out.println("----");

            System.out.println("fib(5)");
            System.out.println("EXPECTED: 5");
            System.out.println(fib(5));

            System.out.println("----");

            System.out.println("fib(7)");
            System.out.println("EXPECTED: 13");
            System.out.println(fib(7));                   // 13

            System.out.println("makeAllSums()");
            System.out.println("-----------------------\n");

            System.out.println("makeAllSums(0)");
            System.out.println("EXPECTED: [0]");
            System.out.println(makeAllSums(0));           // [0]

            System.out.println("----");

            System.out.println("makeAllSums(1)");
            System.out.println("EXPECTED: [1, 0]");
            System.out.println(makeAllSums(1));           // [1, 0]

            System.out.println("----");

            System.out.println("makeAllSums(3)");
            System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
            System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]
    }

}
