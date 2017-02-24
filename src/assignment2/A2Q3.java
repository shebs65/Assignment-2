/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author shebm3906
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city    
        City kw = new City();
        // create robot
        Robot matt = new Robot(kw, 10, 15, Direction.SOUTH);
        // loop
        while (true) {
            // if not facing North, turn until North
            if (matt.getDirection() != Direction.NORTH) {
                matt.turnLeft();
                // if not on street 0, move to street 0
            } else if (matt.getStreet() > 0) {
                matt.move();
                // if on street 0, turn left once and stop
            } else if (matt.getStreet() == 0) {
                matt.turnLeft();
                break;
            }
        }
        // loop
        while (true) {
            // if not on avenue 0, move there
            if (matt.getAvenue() != 0) {
                matt.move();
            }
        }
    }
}