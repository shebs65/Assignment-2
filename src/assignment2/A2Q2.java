/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shebm3906
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create city
        City kw = new City();

        // create robot
        Robot matt = new Robot(kw, 3, 1, Direction.EAST);

        // create hurdles
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 9, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 7, Direction.EAST);

        // create thing
        new Thing(kw, 3, 9);

        // loop
        while (true) {

            // while front is clear, move       
            if (matt.frontIsClear()) {
                matt.move();
            }

            // if front isn't clear, jump hurdle           
            if (!matt.frontIsClear()) {
                matt.turnLeft();
                matt.move();
                matt.turnLeft();
                matt.turnLeft();
                matt.turnLeft();
                matt.move();
                matt.turnLeft();
                matt.turnLeft();
                matt.turnLeft();
                matt.move();
                matt.turnLeft();
            } // if robot can pick up thing, stop
            else if (matt.canPickThing()) {
                break;

            }

        }

    }
}
