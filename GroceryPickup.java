import kareltherobot.*;
import java.awt.Color;

public class GroceryPickup implements Directions {
  public static void main (String[] args)
  {
    (new GroceryPickup()).doWork();
  }
  
  
  public void doWork () {
    int row = 5;
    int col = 7;
    int robinBeepers=5;
    
    World.readWorld("worlds/fig2-10.kwld");
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
    
  UrRobot robin = new UrRobot(row,col,East,
                               robinBeepers,
                               Color.GREEN);
  robin.turnLeft();
  robin.turnLeft();
  robin.move();
  robin.move();
  robin.pickBeeper();
  robin.move();
  robin.turnLeft();
  robin.turnLeft();
  robin.turnLeft();
  robin.move();
  robin.pickBeeper();
  robin.move();
  robin.turnLeft();
  robin.move();
  robin.pickBeeper();
  robin.turnLeft();
  robin.turnLeft();
  robin.turnLeft();
  robin.move();
  robin.pickBeeper();
  
  robin.turnOff(); 
  }
  
}
