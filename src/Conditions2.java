
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create a robot
        Robot karel = new Robot(kw, 4, 1, Direction.EAST);

        //creat path to follow
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 3);

        new Thing(kw, 3, 3);

        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);

        //turn on the thing labels
        kw.showThingCounts(true);

        //making karel step on the first path
        karel.move();

        //loop
        while (true) {
            //if there are things 
            //    pick them all up
            while (karel.canPickThing()) {
                karel.pickThing();
            }
            //if holding 1 thing, move
            if (karel.countThingsInBackpack() == 1) {
                //karel drop things
                karel.putThing();
                //move
                karel.move();
                //if holding 2 things, turn left  
            } else if (karel.countThingsInBackpack() == 2) {
                //drop thing
                karel.putThing();
                karel.putThing();
                //move
                karel.turnLeft();
                karel.move();
            } //if holding 3 things turn right
            else if (karel.countThingsInBackpack() == 3) {
                //drop thing
                karel.putThing();
                karel.putThing();
                karel.putThing();
                //move
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();

                //found 4 things
                break;
            }





        }
    }
}
