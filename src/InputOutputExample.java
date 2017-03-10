
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //scanner to get unser input
        Scanner input = new Scanner(System.in);
        
        //asking the user to type in their name
        System.out.println("Please enter your name");

        //scanning in their name into the variable
        String name2 = input.nextLine();
        //String name = "Jia Ying";
        System.out.println("Hello world");
        //to make it say the name variable 

        //saying hello to the user
        System.out.println("Hello " + name2);

        //ask the user what year they were born 
        //use this to calculate their age

        //sout *hit tab* for short cut
        System.out.println("What year were you born?");
        int year = input.nextInt();

        //determining their age
        int age = 2017 - year;
        if (age > 0) {
            System.out.println("You are " + age + " years old");
        } else {
            System.out.println(" I think you are lying!");
        }

    }
}
