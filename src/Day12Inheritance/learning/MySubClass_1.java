package Day12Inheritance.learning;
/*
Implicitly Call the Superclass Constructor
 */

// Superclass
class MySuperclass_1 {
    // Superclass' instance variable:
    String myString;

    // Superclass' default (empty) constructor:
    MySuperclass_1() {}

    // Superclass' parameterized constructor:
    MySuperclass_1(String myString) {
        // Initialize instance variable
        this.myString = myString;
    }
}

// Subclass
class MySubclass_1 extends MySuperclass{
    MySubclass_1(String myString) {
        // A behind-the-scenes implicit call to the
        // superclass' default constructor happens

        // Subclass can now initialize superclass instance variable:
        this.myString = myString;
    }

    public static void main(String[] args) {
        MySuperclass s1 = new MySubclass("Hello, World!");
        System.out.println(s1.myString);

        MySubclass s2 = new MySubclass("Hello, World.");
        System.out.println(s2.myString);
    }
}