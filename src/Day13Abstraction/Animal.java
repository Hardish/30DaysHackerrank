package Day13Abstraction;

/*
    Abstract class: the classes which extends abstract class, have to implement the abstract methods or become
                    abstract class itself. Because compiler dont know until runtime weather you implemented the abstract method
                    body or not. as other class will handle.

                    with overriding methods, there is an implementation at a superclass level and sometimes at
                    subclass level also Ex: sleep() implemented in the Animal class and Dog and cat class also

                    so compiler knows, if the sleep() not defined in subclass Dog, then sleep() of Animal should call.



 */
public abstract class Animal {

    private int age; //vs private int age; then dog.age wont able to access it but there is a way to work around using getters

    public Animal(int age)
    {
        this.age = age;
        System.out.println("An Animal has been created and age is "+age);
    }

    public int getAge()   //public and protected will allow child class access. but private wont allow it.
    {
        return age;
    }

    public abstract void eat();

    public void sleep()
    {
        System.out.println("An Animal is sleeping");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(12);
        Cat cat = new Cat(7);

        dog.eat();
        cat.eat();

        dog.sleep(); // signature should be same as Animal class.
        cat.sleep();  //signature should be same as Animal class.


        //Casting: when you want Many types of objects use same method.
        // As a programmer we go from bigger to specific -> generalize to specification
        Object d = new Dog(4);
        Dog realDog = (Dog) d;
        realDog.ruff();

        Object str = "est";
        String realStr = (String)str;
        realStr.length();

        //What happens when...
        // Dog object hold properties till end. it will call sleep() method of Dog class both the time as Dog class have sleep()
        // But all methods are available from Animal only for animalDog. ruff and eat wont availble

        Dog doggy = new Dog(5);
        if(doggy instanceof Animal)
        {
            Animal animalDog = (Animal) doggy;
            animalDog.sleep();//sleep() of Dog class got call as Dog class have sleep(), else Animal.sleep() would have called
        }
        doggy.sleep();//sleep() of Dog class got call as Dog class have sleep(), else Animal.sleep() would have called

        Animal ani = new Animal(10) {
            @Override
            public void eat() {
                System.out.println("Ani object and eat method");
            }
        };

        ani.sleep();

    }
}
