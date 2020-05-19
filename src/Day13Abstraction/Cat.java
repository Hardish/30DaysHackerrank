package Day13Abstraction;

public class Cat extends Animal {


    public Cat(int age) {
        super(age);
        System.out.println("A Cat has been created");
    }

    @Override
    public void eat() {
        System.out.println("A Cat is eating");
    }

    //public abstract void eat();
    public void meow()
    {
        System.out.println("A cat meows");
    }

    public void prance()
    {
        System.out.println("A cat is prances");
    }

    public void sleep()
    {
        System.out.println("A Cat is sleeping");
    }
}
