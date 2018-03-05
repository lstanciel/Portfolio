import kareltherobot.*;
import java.awt.Color;

public class CarpetTask
  extends UrRobot
  implements Directions

{
 public CarpetTask(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
  
  public void layRow();
  {
    move();
    putBeeper();
    move();
    putBeeper();
    move();
    putBeeper();
    move();
    putBeeper();
    move();
    putBeeper();
    move();
    putBeeper();
    move();
    putBeeper();
    
  }
  
   public void turnRight()
 {
   turnLeft();
   turnLeft();
   turnLeft();
 }
   
 public static void main(String[] args)
 { 
    World.readWorld("worlds/fig3-9.kwld");
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
    
  CarpetTask jay = new CarpetTask(9, 2, South, 0);
  
  jay.layRow();
  jay.turnRight();
  jay.layRow();
  jay.turnRight();
  jay.layRow();
  jay.turnRight();
  jay.layRow();
  }}
  
  