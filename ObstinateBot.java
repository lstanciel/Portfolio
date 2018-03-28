import kareltherobot.*;
import java.awt.Color;

public class ObstinateBot extends UrRobot{
public ObstinateBot(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
public void move()
{
  putBeeper();
}

public void putBeeper()
{
 move();
}

 public static void main (String[] args)
  {
    World.readWorld("worlds/fig1-2a.kwld");
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
    
    ObstinateBot jane = new ObstinateBot(1,1,North, 3);
    jane.move();
    jane.putBeeper();
    jane.turnOff();
  }
}
  