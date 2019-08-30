package hackerrank;

public class Operators {


    public static void main(String[] args) {

        double mealCost = 12.00;
        int tipPercent = 20;
        int taxPercent = 8;

         double tip = ((mealCost*tipPercent)/100.0);
         double tax = ((mealCost*taxPercent)/100.0);

         double cost =mealCost+tip+tax;
         int totalCost = (int) Math.round(cost);

         System.out.println(totalCost);

         }
}
