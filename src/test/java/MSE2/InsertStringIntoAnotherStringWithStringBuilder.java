package MSE2;

public class InsertStringIntoAnotherStringWithStringBuilder {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();

// approach 1

        StringBuilder sb1 = new StringBuilder("EatMangoes");
        StringBuilder sb2 = new StringBuilder("sweet");

        int indextoInsert = 3;

        sb1.insert(indextoInsert,sb2);

        System.out.println("String after inserting : " + sb1);

// approach 2   Using Substring method

        String s1 = "SummerHot";
        String s2 = "IsVery";

        int indextoInsert1 = 6;

        s1 = s1.substring(0,indextoInsert1)+s2+s1.substring(indextoInsert1);


        System.out.println("String after inserting : " + s1);


// apporach 3 Using for loop

        String result="";
        for(int i=0;i<s1.length();i++)
        {
            if(i!=indextoInsert1)
            {
                result = result+s1.charAt(i);
            }else
            {
                result = result+s2+s1.charAt(i);
            }

        }
        s1=result;
        System.out.println("result is : " + s1);
    }
}
