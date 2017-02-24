/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author shebm3906
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        Robot matt = new Robot(kw, 0, 5, Direction.EAST);
        // create walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.NORTH);
        // loop
        while (true) {
            // algorithm for one side of castle, repeats
            if (matt.frontIsClear());
            {
                matt.turnLeft();
                matt.turnLeft();
                matt.turnLeft();
                matt.move();
                matt.move();
                matt.turnLeft();
                matt.turnLeft();
                matt.turnLeft();
                matt.move();
                matt.turnLeft();
                matt.move();
                matt.turnLeft();
                matt.move();
                matt.turnLeft();
                matt.turnLeft();
                matt.turnLeft();
                matt.move();
                matt.move();
            }





        }
    }
}