package day1_dataTypes;

public class Car {

    /*
        Data type:
                primitive data type: value type(independent from each others)
                                     1.boolean
                                     2.numbers  (integer : int, double: double , float --takes less bytes than the double )
                                     3. characters (char)

                Reference Type:  "shared copy"  -> String/Arrays,Queues,Linked List,stacks (all are example of Data Structures),car
                Data structure is compose of primitive values
     */

    int maxSpeed = 100;  //camel case
    int miniSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char conditions = 'A';
    String nameOfCar = "Lucy";


    double maxFuel = 16;
    double currentFuel = 8;

    public void printVariables()
    {
        System.out.println("This is max Speed: " + maxSpeed);
        System.out.println(miniSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(conditions);
        System.out.println(nameOfCar);
    }

    public void changeCondition() {
        conditions = 'C';
    }

    public void chageSpeed()
    {
        miniSpeed = maxSpeed;
        maxSpeed = maxSpeed + 10;
    }
    public static void main(String[] args) {
        //below part for understanding primitive data types:
        Car car = new Car();  //creating instance object Car class
        car.printVariables();
        System.out.println(car.conditions);


        //below part is to understand Reference data type(shared data)
        Car familyCar = new Car();
        Car dishaCar = familyCar; //sharing the instance
        //printing our familyCar details before changing condition variable
        familyCar.printVariables();
        //changing condition of the car
        dishaCar.changeCondition();
        //printing our familyCar details after changing condition variable
        familyCar.printVariables();


        //below part is to understand independent nature of the primitive type variable
        //change value of oneVaribale will not affect on secondVariable,which is assigned by = operator
        //minSpeed = maxSpeed + 1; and then change maxSpeed from 100 to 105; it wont change minSpeed after assignment operator.

        car.chageSpeed();
        System.out.println("After changing miniSpeed and maxSpeed,as both are independent from each others");
        car.printVariables();
    }


}
