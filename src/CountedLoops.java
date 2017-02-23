
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linj4653
 */
public class CountedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new city
        City kw = new City();
        //create a robot
        RobotSE karel = new RobotSE(kw,1 , 1, Direction.EAST);
        
        // make a counter
        int counter =  0;
        //move 5 times using a condition
        while(counter < 5){
            // move
            karel.move();
            //increase the counter
            counter = counter + 1;  
            //counter++; (another way to add 1 (short cut))
            //counter += 1;  another way to add 1    
            //counter--;  subtract 1
        }
        
        karel.turnAround();
        
        // using a for loop to count
        // for (define a variable; condition to loop; increase vaariable)
        for(int i = 0; i < 5; i = i + 1) //for(int i = 0; i < 5; i++) shortcut
            karel.move();
    
    
    //conpound conditions
    //&& <- AND statement - bothe must be true
    //|| <- OR statement - one of them must be true
    if(karel.frontIsClear()) {
        if(karel.countThingsInBackpack() == 5)
        //do something
    
       
if (karel.frontIsClear() && karel.countThingsInBackpack()== 5) {
// do something
        }

    if (karel.frontIsClear()){}
//do something
 else if (karel.countThingsInBackpack()== 5){
//do same thing as above if statement
     }

if(karel.frontIsClear() || karel.countThingsInBackpack() == 5){
//do something
}
    }
}
}

