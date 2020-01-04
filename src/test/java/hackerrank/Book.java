package hackerrank;

public class Book {


    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut =-1;
    public Book(String booktitle, int bookPageCount, int bookISBN)
    {
this.title=booktitle;
this.pageCount=bookPageCount;
this.ISBN=bookISBN;
isCheckedOut=false;
    }

    public String getTitle()
    {
return this.title;
    }
    public int getPageCount()
    {
        return this.pageCount;

    }
    public int getISBN()
    {
        return this.ISBN;
    }
    public boolean getisCheckedout()
    {
        return this.isCheckedOut;
    }
    public int  getdayCheckedOut()
    {
        return this.dayCheckedOut;
    }

// SETTERS

    public void setIsCheckedOut(boolean newIsCheckedOut,int currentDayCheckedOut)
    {
        this.isCheckedOut=newIsCheckedOut;
        setDayaCheckedOut(currentDayCheckedOut);
    }
   private void setDayaCheckedOut(int day)
   {
       this.dayCheckedOut=day;
   }
}
