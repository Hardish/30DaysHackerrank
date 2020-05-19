package Day14Scope;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements)
    {
        this.elements = elements;
    }

    public void computeDifference()
    {
     /*   int min = Arrays.stream(elements).min().getAsInt();
        int max = Arrays.stream(elements).max().getAsInt();
        maximumDifference = max - min;*/


        IntSummaryStatistics stat = Arrays.stream(elements).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        maximumDifference = max - min;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}