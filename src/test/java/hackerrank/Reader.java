package hackerrank;

 public class Reader extends Writer{

     int price;

     Reader(String title, String author, int price)
     {
         super(title,author);

         this.price = price;
     }
     void display()
     {
         System.out.println("Title:  " +title);
         System.out.println("Author: " + author);
         System.out.println("Price: " + price);
     }


}
