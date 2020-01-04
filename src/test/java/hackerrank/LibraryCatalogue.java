package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    Map<String,Book> bookCollection=new HashMap<String, Book>();

    int currentDay=0;
    int lengthOfCheckoutPeriod=7;
    double initialLateFee=0.50;
    double feePerLateDay=1.00;

    public LibraryCatalogue( Map<String,Book> collection)
    {
        this.bookCollection=collection;
    }

    public LibraryCatalogue( Map<String,Book> collection,int lengthOfCheckoutPeriod, double initialLateFee,double feePerLateDay )

    {
        this.bookCollection=collection;
        this.feePerLateDay=feePerLateDay;
        this.lengthOfCheckoutPeriod=lengthOfCheckoutPeriod;
        this.initialLateFee=initialLateFee;

    }
    // GETTERS


    public int getCurrentDay()
    {
      return this.currentDay;
    }
    public Map<String,Book>getBookCollection()
    {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle)
    {
        return getBookCollection().get(bookTitle);
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }


    // SETTTERS

    public void nextDay()
    {
        currentDay++;
    }
    public void setDay(int day)
    {
        currentDay=day;
    }

    // INSTANCE METHODS

    public void checkoutBook(String title)
    {
  Book book = getBook(title);
   if(book.getisCheckedout())
   {
       sorryBookAlreadyCheckedout(book);
   }else
   {
       book.setIsCheckedOut(true,currentDay);
       System.out.println("You just checked out"+ title + (getCurrentDay() + getLengthOfCheckoutPeriod())+" . ");
   }
    }
    public void returnBook(String title)
    {
        Book book = getBook(title);
        int daysLate = currentDay-(book.getdayCheckedOut() + getLengthOfCheckoutPeriod());

        if(daysLate>0)
        {
            System.out.println("You the library $ " + (getInitialLateFee() + daysLate + getFeePerLateDay()) +
            "becasue your book is " + daysLate + "days overdue");
        } else
        {
            System.out.println("Your book is returned , thank you");
        }
        book.setIsCheckedOut(false, -1);

    }
    public void sorryBookAlreadyCheckedout(Book book)
    {
      System.out.println("Sorry " + book.getTitle() + "is already checked out " + "It should be back on day " + ( book.getdayCheckedOut() + getLengthOfCheckoutPeriod()) + " . ");
    }
    public static void main(String[]args)
    {
        Map<String,Book> bookCollection = new HashMap<String,Book>();
        Book harry = new Book("Harry Potter", 837132,999999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkoutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkoutBook("Harry Potter");
        lib.setDay(5);
        lib.returnBook("Harry Potter");
        lib.checkoutBook("Harry Potter");


    }
}
