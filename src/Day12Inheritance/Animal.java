package Day12Inheritance;
/*
        you cannot go from sub class to super class however vise versa is possible
        so animal = dog possible
        but dog = animal is not possible as it means every animal is dog
 */
public class Animal {

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

    public void eat()
    {
        System.out.println("An animal is eating");
    }

    public static void main(String[] args) {
        Animal animal = new Animal(5);
        Dog dog = new Dog(12);
        Cat cat = new Cat(7);

        dog.ruff();
        cat.meow();

        animal.eat();
        dog.eat();
        cat.eat();

        dog.run();
        cat.prance();

        //always all methods from the left side class is available. right side wont. so Animal's eat() only available for newAnimal
        Animal newAnimal = new Dog(8);
        newAnimal.eat();

 /*     Below will generate error :java.lang.ClassCastException: class Day12Inheritance.Animal cannot be cast to class Day12Inheritance.Dog
        Dog newDog = (Dog) new Animal(4);  // error on casting line. as cannot cast from general to speciafic
                                           // if this lines run in runtime, meaning every animal can be treat as a dog
                                           // which is not true. cow is not dog .... cow cannot ruff.


        newDog.eat();
        newDog.ruff();
        newDog.eat();
        newDog.run();*/


/*        System.out.println("Accessing Age public properties of Animal class using subclass Dog "+dog.age);
        System.out.println("Accessing Age public properties of Animal class using subclass Cat "+cat.age);*/

        System.out.println("Accessing Age private properties of Animal class using subclass Dog "+dog.getAge());
        System.out.println("Accessing Age private properties of Animal class using subclass Cat "+cat.getAge());
    }
}
