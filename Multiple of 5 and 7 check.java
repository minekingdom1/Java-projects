//The purpose of this program is to check if the given number is a multiple of 5 and 7
import java.util.Scanner;       //Imports the scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Initialises scanner object
        boolean given_value = false;                    //Initialises value being given as false.
        while (!given_value) {                          //While value has not been given
            System.out.println("Please input an integer: ");
            try {
                int given_number = Integer.parseInt(scanner.nextLine());        //Attempts to parse the next line as an integer and initialise it as given number
                given_value = true;                                 //Updates given value as true
                if (given_number % 5 == 0 && given_number % 7 == 0 && given_number != 0) {
                    //If given number is a multiple of 5 and 7 with remainder of 0 and is not 0, execute code inside.
                    System.out.printf("The given value of, %d, is both a multiple of 5 and 7.",given_number);
                } else {
                    System.out.printf("The given value of, %d, is NOT both a multiple of 5 and 7.", given_number);
                }
            } catch (Exception e) {     //Catches all errors and prints line.
                System.out.println("The value inputted is not a integer.");
            }
        }
    }
}
