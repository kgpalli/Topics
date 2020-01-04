package hackerrank;

abstract class Writer {

    String title;
    String author;


    Writer(String bookTitle, String bookAuthor)
    {
        this.title = bookTitle;
        this.author = bookAuthor;
    }


   abstract void display();



}
