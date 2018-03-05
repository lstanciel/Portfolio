import kareltherobot.*;
import java.awt.Color;

public class BeeperHandoff implements Directions {
  public static void main (String[] args)
  { World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
    
    UrRobot karel = new UrRobot(1, 1, North, 1);
    UrRobot carl = new UrRobot(1, 3, East, 0);
    
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    carl.pickBeeper();
    carl.turnLeft();
    carl.move();
    carl.move();
    carl.putBeeper();
    carl.turnLeft();
    carl.turnLeft();
    carl.turnLeft();
    
    karel.turnOff();
    carl.turnOff();
    
  }
}
  
  
