package day9_Recursion;

import java.net.SocketOption;
import java.util.Arrays;

public class RecursionGoodLuck {
    //complex things become simple using recursive.
    // This is an algorithmic concept that involves splitting a problem into two parts: a base case and a recursive case.

    //summation in maths: 5+4+3+2+1+0;   7+6+5+4+3+2+1+0;
    public static int Summation(int n)
    {
        //base case: we are at the end
        if(n <= 0)
            return 0;  //additive identity property (what we use to get same input as it is)
        else
            { //Recursive case: Keep going
            return n + Summation(n - 1);
            }
    }

    //5! = 5 * 4 * 3 * 2 * 1;
    //4! = 4 * 3 * 2 * 1;
    public static int Factorial(int n)
    {
        //base case:
        if(n <= 1)
            return 1;  //multiplication identity property
        else //Recursive case
            return n * Factorial(n-1);
    }

    //5^3 = 5 * 5 * 5;
    //5^3 = 5 * 5^2 ----- 5 * 5 * 5^1 ------ 5 * 5 * 5 * 5^0 ----- 5 * 5 * 5 * 1
    public static int Exponentiation(int n,int p)
    {
        //base case
        if(p <= 0 )  //multiplication identity property
        {
            return 1;
        }
        else
        {
            //recursive case
            return n * Exponentiation(n,p-1);
        }

    }

    //nTimesk(4,4) = 4 + nTimes(4,3) --- 4 + 4 + nTimesk(4,2) -- 4 + 4 + 4 + nTimes(4,1) --- 4 + 4 + 4 + 4 + nTimesk(0)
    //----- 4 + 4 + 4 + 4 + 0 -------16
    public static int nTimesK(int n, int k)
    {
        if(k <= 0)
        {
            return 0;
        }
        else
        {
            return  n + nTimesK(n,k-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Summation = " + Summation(5));
        System.out.println("Factorial = " + Factorial(5));
        System.out.println("Exponentiation = " + Exponentiation(2,4));
        System.out.println("nTimesK = " + nTimesK(4,4));
    }

}
