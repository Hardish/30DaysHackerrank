package Day12Inheritance.learning;
/*
When overriding a method, it is best practice to precede the method with the @Override annotation. This has two benefits:

It signifies to both the reader and the compiler that this method is overriding an inherited method.
It helps you check your work because it generates a compiler error if no such method exists in the superclass.
 */

import java.util.Locale;
import java.text.NumberFormat;

class Employee {
    // Instance variables:
    protected String name;
    private int salary;

    /** Parameterized Constructor
     *   @param name The volunteer's name. **/
    Employee(String name) {
        // use name param to initialize instance variable:
        this.name = name;
    }

    /** @return The name instance variable. **/
    String getName() {
        return name;
    }

    /** @param salary The integer to set as the salary instance variable. **/
    void setSalary(int salary) {
        this.salary = salary;
    }

    /** @return The salary instance variable. **/
    int getSalary() {
        return salary;
    }

    /** Print information about an instance of Employee. **/
    void print() {
        if (this.salary == 0) {
            System.err.println("Error: No salary set for "
                    + this.name
                    + "; please set salary and try again.\n");
        }
        else { // Print employee information
            // Formatter for salary
            // This adds commas between zeroes:
            NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.US);

            System.out.println("Employee Name: " + this.name
                    + "\nSalary: "
                    + salaryFormat.format(this.salary) + "\n");
        }
    }
}

class Volunteer extends Employee{
    // instance variable:
    int hours;

    /** Parameterized Constructor
     *   @param name The volunteer's name. **/
    Volunteer(String name) {
        // explicit call to superclass' parameterized constructor
        super(name);
    }

    /** @param //set the hours instance variable. **/
    void setHours(int hours) {
        this.hours = hours;
    }

    /** @return The hours instance variable **/
    int getHours() {
        return hours;
    }

    @Override
    /** Override the superclass' print method
     *   Print information about an instance of Volunteer.
     **/
    void print() {
        System.out.println("Volunteer Name: " + this.getName()
                + "\nHours: " + this.getHours());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Erica");
        employee.print();
        employee.setSalary(60000);
        employee.print();

        Volunteer volunteer = new Volunteer("Anna");
        volunteer.setHours(20);
        volunteer.print();
    }
}
