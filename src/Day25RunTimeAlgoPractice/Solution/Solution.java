package Day25RunTimeAlgoPractice.Solution;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] integers = new int[number];

        for(int i = 0; i < number; i++)
        {
            integers[i] = scanner.nextInt();

        }
        scanner.close();

        for(int i = 0; i < number; i++)
        {
            int num = integers[i];
            boolean flag = false;
            for(int j = 2; j <= num/2; ++j)
            {
                // condition for nonprime number
                if(num % j == 0)
                {
                    flag = true;
                    break;
                }
            }
           String returnsam =  (flag == true)?"Not prime":"Prime";
            System.out.println(returnsam);
        }
    }
*/

        /*
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }

            for (int i = 0; i < a.length; i++) {
                if (isPrime(a[i])) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
            in.close();

        }




    private static boolean isPrime(int n) {
        if (n == 2) { // 2 always prime
            return true;
        }
        if (n == 1 || n % 2 == 0) { // 1 and even always not prime
            return false;
        }
        // start checking with 3 since 1 and 2 are covered above
        for (int i = 3; i * i <= n; ) {
            if (n % i == 0) {
                return false;
            }
            i += 2; // no need to check even so increment to next odd number.
        }
        return true; */


        Scanner scanner = new Scanner(System.in);
        int totalNumber = scanner.nextInt();

        int[] number = new int[totalNumber];
        for(int i = 0 ; i < totalNumber ; i++) {
            number[i] = scanner.nextInt();
        }
        scanner.close();

        //checking logic
        //if flag is false -> prime
        //if flag is true --> not prime

        for(int i = 0; i < totalNumber ; i++) {
            if(checkPrime(number[i]))
                System.out.println("Not prime");
            else
                System.out.println("Prime");
        }

    }

    public static boolean checkPrime(int n) {
      ///  boolean flag = false;
        if(n == 2)
            return false;

        if(n == 1 || n % 2 == 0)
            return true;

        for(int i = 3; i * i<=n;i+=2) {
            if(n % i == 0)
                return true;
        }
        return false;
    }
}
