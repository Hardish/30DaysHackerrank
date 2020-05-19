package Day28DatabaseUser.Solution;

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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      ArrayList<String> name = new ArrayList<>();  // replaced String[] with the ArrayList because of java.lang.NullPointerException at ComparableTimSort.java:320
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if(emailID.contains("@gmail.com")) {
                name.add(firstName);
            }

        }
/*
 for more understanding of the run time error happen
https://stackoverflow.com/questions/24175145/sorting-an-array-of-strings-in-java

 */
     /*   for(int i = 0 ; i < name.length-1; i++) {
            if(name[i].compareTo(name[i+1]) == 1) {

            } else if(name[i].compareTo(name[i+1]) > 1) {
                String temp = name[i];
                name[i] = name[i+1];
                name[i+1] = temp;
            } else if(name[i].compareTo(name[i+1]) < 1) {

            }

        }*/

        //Arrays.sort(name); throwing comparable run time error as some String[] was null and not set ""

        Collections.sort(name);
        for(String names:name) {
            System.out.println(names);
        }


        scanner.close();
    }
}
