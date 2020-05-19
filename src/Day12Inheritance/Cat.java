package Day12Inheritance;

public class Cat extends Animal{


    public Cat(int age) {
        super(age);
        System.out.println("A Cat has been created");
    }

    public void meow()
    {
        System.out.println("A cat meows");
    }

    public void prance()
    {
        System.out.println("A cat is prances");
    }
}
