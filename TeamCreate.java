import kareltherobot.*;
import java.awt.Color;

public abstract class TeamCreate extends UrRobot
{
  public abstract void BetterRobot();
  
  public void turnRight();
  {  
   turnLeft();
   turnLeft();
   turnLeft();
 }
  
  public TeamCreate(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
  
  public class BetterRobot extends TeamCreate{
  public BetterRobot(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
    a= new TeamCreate(row+1, col,dir, beep);
    b= new TeamCreate(row+2, col,dir, beep);
    c= new TeamCreate(row+3, col,dir, beep);
  }
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
  }
  
}
}