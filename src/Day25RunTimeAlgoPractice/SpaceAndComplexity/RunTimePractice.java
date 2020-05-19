package Day25RunTimeAlgoPractice.SpaceAndComplexity;

import java.util.HashMap;

/*
        1. repetition of character :findNumberOfRepetitions

       Best complexity from higher to lower priority:constant O(1),logarithmic O(log(n)),liner O(n),Quadratic O(n^2)

 */
public class RunTimePractice {

    public static  int findNumberOfRepetitions(String s,char c) {  //Linear time O(n) time
        int sum = 0;  //constant 1
        //1,n+1,n
        for(int i = 0;i<s.length();i++) { //liner complexity: i = 0 will execute 1 time,i<s.length() for n+1, i++ for n times
            if(s.toLowerCase().charAt(i) == c) {  //n time
                sum++;  //n time
            }
        }
        return sum;  //1
    }

    public static int[] findNumOfRepetitions_v1(String s, char[] c) {  //brute force solution
        // Quad time: O(n * m) time
        int[] sums = new int[c.length];  //1
        for(int i = 0; i < s.length(); i++) {  //1,n+1,n
            for(int j = 0; j < sums.length; j++) {  //n+1,n*m + 1,n*m where m is size of c[]
                if(s.charAt(i) == c[j]) {  //n*m
                    sums[j] = sums[j] + 1;  //n*m
                }
            }
        }
        return sums;  // 1
     }

     public static int[] findNumOfRepetitions_v2(String s,char[] c) {
        //optimal time: O(n + m)  //s or c length is major factor
         int[] sums = new int[c.length];
         HashMap<Character,Integer> map = new HashMap<>();
         for(int i = 0; i < s.length(); i++) {
             if(!map.containsKey(s.charAt(i))) {
                 map.put(s.charAt(i),1);
             } else {
                 int sum = map.get(s.charAt(i));
                 map.put(s.charAt(i),sum++);
             }
         }
        for(int j = 0; j < c.length ; j++) {

            if(!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
     }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitions("abca",'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");

        System.out.println();
        System.out.println();
        char a[] = {'C','v','a','b','E','x','Y'};
        long startTime_v1 = System.currentTimeMillis();
        System.out.println(findNumOfRepetitions_v1("dONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvE",a));
        long endTime_v1 = System.currentTimeMillis();
        long duration_v1 = endTime_v1 - startTime_v1;
        System.out.println("Test of Version 1 " + duration_v1 + "ms");

        System.out.println();
        System.out.println();
        long startTime_v2 = System.currentTimeMillis();
        System.out.println(findNumOfRepetitions_v2("dONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvEdONRNxhpCFMCcHtiOUvE",a));
        long endTime_v2 = System.currentTimeMillis();
        long duration_v2 = endTime_v2 - startTime_v2;
        System.out.println("Test " + duration_v2 + "ms");
    }
}
