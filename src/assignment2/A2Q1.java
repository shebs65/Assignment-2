/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author shebm3906
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city
        City kw = new City();

        //create robot
        Robot matt = new Robot(kw, 1, 1, Direction.EAST);

        //create things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        //show thing labels
        kw.showThingCounts(true);

        //move robot
        matt.move();

        //can pick thing
        while (true) {
            while (matt.canPickThing()) {
                matt.pickThing();
            }

            // if holding 1 thing, move
            if (matt.countThingsInBackpack() < 7) {
                // move
                matt.move();
            } //if holding 7 things, move 4 then stop
            else if (matt.countThingsInBackpack() == 7) {
                //move
                matt.move();
                matt.move();
                matt.move();
                matt.move();
                break;
            }

        }
    }
}
