package Day16Exception;
/*
    when some method create error, it will create error object and handle to runtime System.
    which make program end abruptly
    two ways to handle error:
    1. checked exception : compiled time (dont allow your program to run)
    2. unchecked exception : occurred at run time arise normally from logical error

    we can handle unchecked/runtime exception using,
    1.try/catch block: try to do certain part of code, and if error comes, then go with catch block

    Why exception useful:
    - work on all condition
    - easy safe guard against bad inputs

 */

public class ExceptionPractice {
    public static void main(String[] args) {

        // compile time error;
        //int[] intarry = new int[10]();

 /*     Run time exception
        int[] intarry = new int[10];  //the size is from 0 to n-1 which is 0 to 9
        System.out.println(intarry[10]); // run time array out of bound exception*/

        try{
            int[] c = new int[5];  //int array initialize in java with 0
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
          //  e.printStackTrace();
            System.out.println("Exception Thrown" +e);
        } catch (NumberFormatException e)
        {
            System.out.println("Number format exception" + e);
        }

        finally {
            System.out.println("this will run automatically, finally finished try-catch");
        }
       // System.out.println("finally finished try-catch");  //this will run by try and catch both
    }
}
