package Day26UnitTestingWith_BinarySearchTree.Solution;

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dateActual = scanner.nextInt();
        int monthActual = scanner.nextInt();
        int yearActual = scanner.nextInt();

        int dateExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();

        int monthDiff = monthActual - monthExpected;
        int daysDiff = dateActual - dateExpected;
        int yearDiff = yearActual - yearExpected;

        System.out.println (
                (yearDiff > 0 ) ? 10000
                        : (monthDiff > 0 && yearDiff == 0) ? monthDiff * 500
                        : (daysDiff > 0 && yearDiff == 0) ? daysDiff * 15
                        : 0
        );


    }

    /*private static void calculateTheFine(int dateActual, int monthActual, int yearActual, int dateExpected, int monthExpected, int yearExpected) {
        if(yearActual == yearExpected) {
            if(monthActual == monthExpected) {
                if(dateExpected >= dateActual) {
                    fine = 0;
                }
                else {
                    fine = (dateActual - dateExpected) * 15;
                }
            } else {
                fine = 500 * (monthExpected - monthActual);
            }
        } else {
            fine = 10000;


    }}*/
}