
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linj4653
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a city
        City kitchener = new City();
        //create a robot
        Robot karel = new Robot(kitchener, 1, 1, Direction.EAST);
        //build a wall
        new Wall(kitchener, 1, 5, Direction.EAST);
        //an infinint loop
        //ask the robot if the front is clear
        while(karel.countThingsInBackpack() < 5){
            karel.move();
            karel.turnLeft();
            //if there is something to pick up 
            if(karel.canPickThing()){
            //pick up everything
            karel.pickThing(); 
            break;}
        }
        //did Karel hit a wall
            if(karel.frontIsClear() == false)
        //another way to say did Karel hit a wall
            //if(!karel.frontIsClear())
                karel.turnLeft();
    }
}
