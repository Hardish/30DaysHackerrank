package Day12Inheritance;

public class Dog extends Animal {

    public Dog(int age)
    {
        super(age); //we are creating animal as dog is one type of the animal. using super as how to call Animal() constructor
        //without object ? Animal() will be weired.
        System.out.println("A Dog has been created");
    }

    public void ruff()
    {
        System.out.println("The dog says ruff");
    }

    public void run()
    {
        System.out.println("A Dog is running");
    }
}
