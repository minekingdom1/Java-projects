//The purpose of this project is to calculate the average of a set of 5 given numbers using a while loop
import java.util.Scanner;       //Imports the scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Initialises scanner object
        int count = 0;                                  //Initialises count integer as 0
        int total = 0;                                  //Initialises total integer as 0
        String[] order = {"first","second","third","fourth","fifth"};   //Initialises order string list.
        while (count < 5) {                             //While count is less than 5, execute code within.
            System.out.println("Input the " + order[count] + " integer:");
            try {                                       //Attempt code inside
                int number = Integer.parseInt(scanner.nextLine());      //Initialises number integer as a parsed integer of the inputted line
                total = total + number;                 //Updates total as total plus number
                count++;                                //Updates count as count plus 1
            } catch (Exception e) {                     //Catch any errors and execute code within
                System.out.println("Invalid input. Please only input integers.\n");
            }
        }
        double average = (double) total / 5;            //Initialises average double as total divided by 5
        System.out.printf("The average of the set of numbers is %.3f.",average);
    }
}
