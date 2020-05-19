package Day11_LibraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    //properties/fields/global variables
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthCheckedoutPeriod = 7;
    double initalLateFee = 0.50;
    double feePerLateDay = 1.00;

    //Constructors
    public LibraryCatalogue(Map<String,Book> bookCollection)
    {
        this.bookCollection = bookCollection;
    }

    //Constructor
    public LibraryCatalogue(Map<String,Book> bookCollection,int currentDay, int lengthCheckedoutPeriod,
                            double initalLateFee,double feePerLateDay)
    {
        this.bookCollection = bookCollection;
        this.currentDay = currentDay;
        this.lengthCheckedoutPeriod = lengthCheckedoutPeriod;
        this.initalLateFee = initalLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    //Getters

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public Book getBook(String boolTitle)
    {
        return getBookCollection().get(boolTitle);
    }
    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthCheckedoutPeriod() {
        return lengthCheckedoutPeriod;
    }

    public double getInitalLateFee() {
        return initalLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    //Setters

    public void nextDay()
    {
        currentDay++;
    }

    public void setCurrentDay(int day)
    {
        this.currentDay = day;
    }

    //Instance method

    public void checkOutBook(String title)
    {
        Book book = getBook(title);
        if(book.isCheckedOut())
        {
            //book is already checked out. so not available
            bookAlreadyCheckedout(book);
        }
        else
        {
            book.setIsCheckedout(true,currentDay);
            System.out.println("You just checked out "+title +". It is due on day " +
                    (getCurrentDay() + getLengthCheckedoutPeriod()) + ".");
        }
    }

    public void returnBook(String title)
    {
        Book book = getBook(title);
        int daysLate = currentDay;

        if(daysLate > 0 )
        {
            System.out.println("You owe the library $" +(getInitalLateFee() + getFeePerLateDay() * daysLate) +
                    " because your book is "+daysLate +" days overdue.");
        }
        else
        {
            System.out.println("Book Returned. Thank you");
        }
        book.setIsCheckedout(false,-1);
    }

    public void bookAlreadyCheckedout(Book book) {
        System.out.println("Sorry, " + book.getTitle() +" is already checked out. "+
                "It should be back on day "+ (book.getDayCheckedOut() + getLengthCheckedoutPeriod()) + ".");
    }


    static public void main(String[] args) {

        Map<String,Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter",654343,323232);
        bookCollection.put("Harry Potter",harry);

        LibraryCatalogue libraryCatalogue = new LibraryCatalogue(bookCollection);

        libraryCatalogue.checkOutBook("Harry Potter");
        libraryCatalogue.nextDay();
        libraryCatalogue.nextDay();
        libraryCatalogue.checkOutBook("Harry Potter");
        libraryCatalogue.setCurrentDay(17);
        libraryCatalogue.returnBook("Harry Potter");

        libraryCatalogue.checkOutBook("Harry Potter");

    }
}
