package Day10Binary;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    String binaryOutput;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       int n = 38289701;

        int ans = 0;
        while (n > 0)
        {
            n &= (n<<1);
            ans += 1;
        }
        System.out.println(ans);
        int i = 38289701;
        System.out.println(Integer.toBinaryString(i));

        int count = consecutiveZeros(i);
        System.out.println("Consecutive zeros: " + count);
    }
    public static int consecutiveZeros(int n) {

        int max = Integer.numberOfLeadingZeros(0);
        int consecutive = 0;
        int currentCount = 0;
        while (Integer.numberOfLeadingZeros(n) != max) {
            if ((n & 1) == 0) {
                currentCount++;
            } else {
                if (currentCount > consecutive) {
                    consecutive = currentCount;
                }
                currentCount = 0;
            }
            n = n >> 1;
        }
        return consecutive;
    }
}