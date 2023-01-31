import java.util.Arrays;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int viewsCount = 325_156_266; //We can add _ in integer number
        System.out.println(viewsCount);

        Date now = new Date(); 
        now.getTime();
    
        System.out.println(now); // sout + tab to write fast System.out.println()

        String hello = "  Hello World" + "!!! ";
        System.out.println(hello.trim()); // trim delete whitespace

        String testTab = "Here is no tab, \t here is one"; //\t to add a tab
        System.out.println(testTab);

        int [] numbers = new int[5];
        numbers[1] = 5;
        numbers[3] = 9;

        System.out.println(Arrays.toString(numbers)); //Use Arrays to print numbers as an aray 

        //An other and newer method to declare an array

        int [] numberOther = {1,6,8,9};
        System.out.println(numberOther.length); // point operator to add method
        Arrays.sort(numberOther); 
        System.out.println(Arrays.toString(numberOther));
        
        //Creation of a matrix

        int [] [] matrix = new int [3] [3];
        matrix[2][1] = 8;
        System.out.println(Arrays.deepToString(matrix)); //We use deepToString to print a multidimensional array

        //An other method to create a matrix

        int [] [] matrixOther = {{1,2,3},{4,5,6},{9,6,7}};
        System.out.println(Arrays.deepToString(matrixOther));

        //To declare a constant we use the final keyword

        final float pi = 3.14F; //We add F to tell it's a float

        double result = (double)1 / (double)3; //To tell 1/3 that it's a double expression we use casting 
        System.out.println(result);

        //Random

        double result2 = Math.random() * 100; // Generate a random number between 0-100
        System.out.println(Math.round(result2)); //Using roud method to round the random number
        
        //An other method to round with casting

        int resultInt = (int) (Math.random() * 100); //Use () or it will be 0, (int of 0 is 0)
        System.out.println(resultInt);

    }
}
