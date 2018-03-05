import kareltherobot.*;
import java.awt.Color;

public class KarelStarter implements Directions {
  public static void main (String[] args)
  {
    (new KarelStarter()).doWork();
  }
  
  
  public void doWork () {
    int adamRow=3; 
    int adamCol=4;
    int adamBeepers=5;
    
    World.readWorld("worlds/fig1-2a.kwld");
    
    World.setVisible(true);
    World.setDelay(100);
    UrRobot adam = new UrRobot(adamRow,adamCol,East,
                               adamBeepers,
                               Color.GREEN);
    
    adam.move();
    adam.move();
    adam.turnLeft();
    adam.putBeeper();
    adam.move();
    
    adam.turnOff();
      
  }

}
