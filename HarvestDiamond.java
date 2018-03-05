import kareltherobot.*;
import java.awt.Color;

public class HarvestDiamond
  extends UrRobot
  implements Directions

{
 public HarvestDiamond(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
  
 public void turnRight()
 {
   turnLeft();
   turnLeft();
   turnLeft();
 }
  public void upRowin()
  {
   turnRight();
   move();
   turnLeft();
    
  }
  
  public void upRowout()
  { 
    turnLeft();
    move();
    turnLeft();
  }
 
  public void downRowin()
  { 
    turnRight();
    move();
    turnRight();
    move();
  }
  public void collectRow1()
  {
    move();
    pickBeeper();
  }
  
 public void collectRow2()
  {
    move();
    pickBeeper();
    turnLeft();
    move();
    move();
    pickBeeper();
    move();
  } 
  
 public void collectRow3()
  {
    pickBeeper();
    turnLeft();
    turnLeft();
    move();
    move();
    pickBeeper();
    move();
    move();
    pickBeeper();
    move();
  } 
  
 public void collectRow4()
  {
    pickBeeper();
    move();
    move();
    pickBeeper();
    move();
    move();
    pickBeeper();
    move();
    move();
    pickBeeper();
  } 

public void collectRow3down()
  {
    pickBeeper();
    move();
    move();
    pickBeeper();
    move();
    move();
    pickBeeper();
  }
public void collectRow2down()
  {
    move();
    pickBeeper();
    move();
    move();
    pickBeeper();
  }

public static void main(String[] args)
 {
    World.readWorld("worlds/fig3-5.kwld");
    World.setVisible(true);
    World.setDelay(10);
    //World.showSpeedControl(true);
   
   HarvestDiamond cam = new HarvestDiamond(1, 6, North, 0);
                                           
    cam.collectRow1();
    cam.upRowin();
    cam.collectRow2();
    cam.upRowin();
    cam.collectRow3();
    cam.upRowout();
    cam.collectRow4();
    cam.downRowin();
    cam.collectRow3down();
    cam.upRowout();
    cam.collectRow2down();
    cam.downRowin();
    cam.pickBeeper();
    cam.turnOff();
  }
}
  
  