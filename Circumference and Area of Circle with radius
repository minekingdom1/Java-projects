//The purpose of this program is to calculate the circumference and area of a circle with a given radius
import java.util.Scanner;   //Importing scanner class
import java.lang.Math;      //Importing Math class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Setting up scanner object
        boolean given_value = false;                //Initialising the value being given as false
        while (!given_value){                       //While a value has NOT been given
            System.out.println("Please input an real numbers for the radius of the circle: ");
            String number = scanner.nextLine();     //Calls scanner object to scan input in next line

            try {
                double radius = Double.parseDouble(number);     //Attempts to parse the input as a double
                double circumference = 2 * Math.PI * radius;    //Initialises circumference as 2 times pi and given radius
                double area = Math.PI * Math.pow(radius,2);     //Initialises area as pi times the given radius to the power of 2

                given_value = true;     //Updates value to being given. Stops while loop.

                System.out.printf("The circumference and area of a circle with radius, %.4f,is %.4f and %.4f.",
                        radius,circumference,area);
            } catch (Exception e) {     //Catches all errors and prints line
                System.out.println("Incorrect data type. Please only input real numbers.");
            }
        }
    }
}
