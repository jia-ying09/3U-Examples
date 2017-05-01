/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linj4653
 */
public class MethodsExample {
    /**
     * say hello
     */
    //method to say hello
    public static void sayHello(){
        System.out.println("Hello");
    }
    /**
     * Say hello to a specified user
     * @param name the name of the user 
     */
    //say hello to specific name
    //overloaded method.. has parameters
    public static void sayHello (String name){
        System.out.println("Hello, " + name);    
    
    }
    
    /**
     * Calculates the volume of a cylinder
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     * @return the volume of the cylinder given the height and the radius
     */
    public static double volumeOfCylinder(double radius, double height){
        
        double rSquared = Math.pow(radius, 2);
        double volume = Math.PI*rSquared*height;
        
        return volume; //sends back the answer
}
    
    public static void addFive(int num) {
        num = num + 5;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //calling the sayHello method
        
        String n = "Gandalf";
    sayHello();
    sayHello("Sam");
    sayHello("Frodo");
    sayHello(n);
    
    //radius = 10, height = 15
    double answer = volumeOfCylinder(10, 15);
        System.out.println(answer);
    
   /*   // num = 10; NOT int num = 10;
        num = 10;{
        addFive(num);
        System.out.println(num);
        */
    }
}
