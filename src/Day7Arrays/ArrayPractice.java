package Day7Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//ARRAY:[0, 5, 5, 4, 1] FROM STARTING 0 AT FIRST .SO, HAVE LENGTH = 4
//ARRAY:["Disha","Kelly" ,"Selly"] -- > length = 3


//Random Objects from array
//Math.abs(rand.nextInt) % length; --> this will give possible random index from array

/*
  so we cannot add into array length, we have to create whole new array obj.
  intArray is ref data type. they hold pointer not data directly
  same with String Array also
 */
public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        //initializing array with 3 different type
        //1st
        int[] intArray1;
        //2nd
        int[] intArray2 = new int[4];
        //3rd
        int[] intArray3 = {5,2,8,4,6,2,24};

        String[] stringArray = {"DIsha","khyati","utsav"};
        String[] shoppingList = {"Bananas","Apples","Pears"};
        printArray(intArray2);
        //initializing array
        intArray2[0] = 100;
        intArray2[1] = 200;
        intArray2[2] = 300;
        intArray2[3] = 400;

        //print the arrays
        System.out.println(Arrays.toString(intArray2));  //initially all will be 0
        System.out.println(Arrays.toString(intArray3));
        //System.out.println(Arrays.toString(intArray1)); // it is not initialized
        System.out.println();


        //Custom print out Arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        //retrieve object
        System.out.println(intArray3[3]);
        System.out.println(Array.get(intArray2,2));  //
        System.out.println();

        //Given fucnctions
        Arrays.sort(intArray3);  //it will change the intArray2. destructive function
        printArray(intArray3);


        //Print String Array
        printArray(shoppingList);


        //Special Foreach loop
        System.out.println("Special foreach loop:");
        for(String s:stringArray) {
            System.out.print(s);
            System.out.print("  ");
        }

    }
}
