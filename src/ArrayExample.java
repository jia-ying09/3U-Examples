
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);

        //create a list of 5 numbers
        double[] marks = new double[5];

        //scan in some marks
        System.out.println("Please enter in 5 marks");

        /*  //put the number in the first position
         marks[0] = input.nextDouble();
         //put a number in the second position
         marks[1] = input.nextDouble();
         //continue...
         marks[2] = input.nextDouble();
         marks[3] = input.nextDouble();
         marks[4] = input.nextDouble(); */

        //better way to do this is for loops
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //enhanced for loop
        for (double num : marks) {
            System.out.println("num");
        }

        System.out.println("The numbers in your sum are");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //use a loop to determine the sum
        //start with accumulator
        double sum = 0;
        //for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //add whatever number i am on
            sum = sum + marks[i];
        }
        System.out.println("The sum is " + sum);

        //calculate the average
        double average = sum / marks.length;
        System.out.println("Average is " + average);
    }
}