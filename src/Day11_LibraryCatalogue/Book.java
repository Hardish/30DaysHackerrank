package Day11_LibraryCatalogue;

public class Book {

    //properties, fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //whether or not book is checked out or not
    int dayCheckedOut = -1; //we will increment is once isCheckedOut flag will be set

    //constructor
    public Book(String title,int pageCount,int ISBN)
    {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    //Getters --- INSTANCE METHOD

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }


    //Setters  --- SET VALUE

    public void setIsCheckedout(boolean isCheckedOut,int dayCheckedOut)
    {
        this.isCheckedOut = isCheckedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    /*
    only book class can access setDayCheckedOut from above method as is it private
    LibraryCatalogue cannot access serDayCheckedOut method.
     */
    private void setDayCheckedOut(int days)
    {
        this.dayCheckedOut = days;
    }
}
