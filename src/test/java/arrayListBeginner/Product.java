package arrayListBeginner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Product {

    int itemNo;
    String name ;
    double price;

    Product(int i, String s, double d) {
        this.itemNo = i;
        this.name = s;
        this.price = d;
    }
        public static void main(String[] args) {
          Product p1 = new Product(10,"Coffee",98.5);
          Product p2 = new Product(11,"tea",101.2);
          Product p3  = new Product(12,"greanTes",77.5);

            ArrayList<Product> pr = new ArrayList<Product>();

            pr.add(p1);
            pr.add(p2);
            pr.add(p3);

            Iterator itr = pr.iterator();
            while(itr.hasNext())
            {
                Product st = (Product)itr.next();
                System.out.println(st.itemNo + " " + st.name + " " + st.price);
            }

            ArrayList<String>list2 =  new ArrayList<>();
            list2.add("Java");
            list2.add("JavaAdvance");
            list2.add("JavaScript");
            list2.add("Selenium");
            list2.add("Python");

            System.out.println("The list is " +list2);



            // converting ArrayList to HashMap before Java 8


            HashMap<String,Integer> map1 = new HashMap<String,Integer>();
            for(String str : list2)
            {
              map1.put(str,str.length());// it prints string & its length of characters
            }

           System.out.println("Generated map " +map1);

// Using Lambda expression

        }

}
