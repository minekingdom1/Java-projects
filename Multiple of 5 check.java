//The purpose of this program is to check if a given number is a multiple of 5
import java.util.Scanner;       //Imports scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Initialises scanner object
        boolean given_value = false;                    //Initialises value having been given as false
        while (!given_value) {                          //While value having been given as false
            System.out.println("Please input a value to check:");
            String number = scanner.nextLine();         //Initialises number as scanner object, scanning next line
            try {
                int given_number = Integer.parseInt(number);        //Attempts to parse number as given number
                given_value = true;                                 //Updates value having been given as true
                if (given_number % 5 == 0 && given_number != 0) {   /*If the given number when divided by 5 has a remainder of 0
                                                                    and the given number is NOT 0, execute code inside.*/
                    System.out.printf("The given number of, %d, is a multiple of 5.", given_number);
                } else {
                    System.out.printf("The given number of, %d, is NOT a multiple of 5.", given_number);
                }
            } catch (Exception e) {    //Catches any errors and prints line.
                System.out.println("The input was not a valid value. Please only input integers.\n");
            }
        }
    }
}
