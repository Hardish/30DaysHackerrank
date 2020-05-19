package Day17ExceptionThrows;

import java.util.concurrent.TimeUnit;

/*
If an exception might arise

1. Use try - catch block
2. Use the Keyword "Throws" in the method signature, which states that we will handle
   this error higher up in the program.

We can throw an error inside of a method using "Throw" when we know something is wrong with the program
(even if java doesn't know something is wrong)

catch is always best to use so your program dont end up abnormally and user friendly error message can come
 */
public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;


    public static void drinkHotChocolate(double cocoaTemp) throws TooColdException, TooHotException {
        if (cocoaTemp >= tooHot)
            throw new TooHotException();
        else if (cocoaTemp <= tooCold)
            throw new TooColdException();
        else
            System.out.println("Enjoy your hot coffee");
    }

    public static void main(String[] args) throws InterruptedException {

        double currentCocoaTemp = 170;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);  //there will be toocold or toohot one only at same time
                System.out.println("The best Cocoa...!!!!");
                wrongTemp = false;
            } catch (TooColdException e) {
                System.out.println("That's so cold! It's like the arctic");
                currentCocoaTemp = currentCocoaTemp + 5;
            } catch (TooHotException e) {
                System.out.println("That's too hot!!!");
                currentCocoaTemp = currentCocoaTemp - 5;
            }
            TimeUnit.SECONDS.sleep(5);
        }
        System.out.println("And its's gone");
    }
}

