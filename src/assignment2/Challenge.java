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
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // create city
        City kw = new City();
        // create robots
        Robot karel = new Robot (kw, 0, 3, Direction.SOUTH);
        Robot tina = new Robot (kw, 0, 3, Direction.SOUTH);
        
       new Wall (kw, 0, 2, Direction.EAST);
       new Wall (kw, 1, 2, Direction.EAST);
       new Wall (kw, 2, 2, Direction.EAST);
       new Wall (kw, 3, 2, Direction.EAST);
       new Wall (kw, 4, 2, Direction.EAST);
       new Wall (kw, 5, 2, Direction.EAST);
       new Wall (kw, 6, 2, Direction.EAST);
       new Wall (kw, 7, 2, Direction.EAST);
       new Wall (kw, 8, 2, Direction.EAST);
       new Wall (kw, 9, 2, Direction.EAST);
       new Wall (kw, 0, 3, Direction.EAST);
       new Wall (kw, 1, 4, Direction.NORTH);
       new Wall (kw, 1, 5, Direction.NORTH); 
       new Wall (kw, 1, 6, Direction.NORTH);
       new Wall (kw, 1, 7, Direction.NORTH);
       new Wall (kw, 4, 4, Direction.NORTH);
       new Wall (kw, 4, 5, Direction.NORTH); 
       new Wall (kw, 4, 6, Direction.NORTH);
       new Wall (kw, 2, 4, Direction.SOUTH);
       new Wall (kw, 2, 5, Direction.SOUTH); 
       new Wall (kw, 2, 6, Direction.SOUTH);
       new Wall (kw, 2, 7, Direction.SOUTH);
       new Wall (kw, 4, 4, Direction.SOUTH);
       new Wall (kw, 4, 5, Direction.SOUTH); 
       new Wall (kw, 4, 6, Direction.SOUTH);
    }
}
