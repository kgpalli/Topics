package geeksforgeeks;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.nio.charset.Charset;
import java.util.Random;

public class GenerateRandomString {

//1  Generate Random Unbounded String With Plain Java
    @Test
    void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect(){

        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        System.out.println(generatedString);

        // answer = I�|1筆 or ?��e�� or G�u�J~~
    }


    // 2 Generate Random Bounded String With Plain Java

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect() {

        int leftlimit = 97;  //letter 'a'
        int rightlimit = 122 ; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder sb = new StringBuilder(targetStringLength);

        for(int i=0;i<targetStringLength;i++)
        {
            int randomLimiLength = leftlimit+(int)(random.nextFloat()*(rightlimit-leftlimit+1)); // it returns an int between 97 & 122 [ a to z]

            sb.append((char) randomLimiLength);
        }
        String generatedString = sb.toString();
        System.out.println(generatedString);  // Answer = lvupwkzuwq


    }

    //  3 Generate Random Alphabetic String With Java 8
    @Test
    public void givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {

        int leftlimit = 97;  //letter 'a'
        int rightlimit = 122 ; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftlimit,rightlimit+1).limit(targetStringLength).
                collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();

        System.out.println(generatedString); // hqynkrocmp

    }


    // 4 Generate Random Alphanumeric String With Java 8

    @Test
    public void givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect() {

        int leftlimit = 97;  //letter 'a'
        int rightlimit = 122 ; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftlimit,rightlimit+1).
                filter(i -> (i<=57 || i>=65) && (i<=90 || i>=97)).limit(targetStringLength).
                collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println(generatedString); // jzvxmlicyk


    }

    // 5. Generate Bounded Random String With Apache Commons Lang


    @Test
    public void givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect() {

        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length,useLetters,useNumbers);
        System.out.println(generatedString);


    }

  //  6. Generate Alphabetic String With Apache Commons Lang

    @Test
    public void givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect() {

        String generatedString = RandomStringUtils.randomAlphabetic(10);

        System.out.println(generatedString);
    }

    // Generate Alphanumeric String With Apache Commons Lang

    @Test
    public void givenUsingApache_whenGeneratingRandomAlphanumericString_thenCorrect(){
        String generatedString = RandomStringUtils.randomAlphanumeric(10);
        System.out.println(generatedString);   // Ans = hLQTMprI2W
    }



}
