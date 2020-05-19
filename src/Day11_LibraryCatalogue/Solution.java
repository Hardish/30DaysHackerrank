package Day11_LibraryCatalogue;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = {
                {1 ,1 ,1 ,0 ,0 ,0},
                {0 ,1 ,0 ,0 ,0 ,0},
                {1 ,1 ,1 ,0 ,0 ,0},
                        {0, 0 ,2 ,4, 4, 0},
                                {0 ,0 ,0 ,2 ,0 ,0},
                                        {0, 0 ,1 ,2, 4, 0}
        };

        int maxsum= Integer.MIN_VALUE;
        for(int row = 0;row <arr.length-2; row++)
        {
            for(int col = 0;col < arr[row].length-2; col++)
            {
                //System.out.print(arr[row][col]+ " ");
                int sum = arr[row][col] + arr[row][col+1] + arr[row][col+2] + arr[row+1][col+1]
                        + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];

                if(sum > maxsum)
                {
                    //replace value in the max sum
                    maxsum = sum;
                }
            }
            //System.out.println();
        }
        System.out.println(maxsum);
    }
}
