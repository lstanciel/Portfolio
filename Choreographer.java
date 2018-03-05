import kareltherobot.*;
import java.awt.Color;

public class Choreographer extends UrRobot {
  
  private UrRobot a,b,c;
  
public Choreographer(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
    a= new UrRobot(row+1, col-1,dir, beep);
    b= new UrRobot(row+2, col-2,dir, beep);
    c= new UrRobot(row+3, col-3,dir, beep);
  }
  
public void move()
{ 
  super.move();
  a.move();
  b.move();
  c.move();
}
 
public void turnLeft()
{ 
  super.turnLeft();
  a.turnLeft();
  b.turnLeft();
  c.turnLeft();
}

public void pickBeeper()
{
  super.pickBeeper();
  a.pickBeeper();
  b.pickBeeper();
  c.pickBeeper();
}

 public void turnRight()
 {
   turnLeft();
   turnLeft();
   turnLeft();
 }
 
public void nextRow()
 {
   turnLeft();
   move();
   turnRight();
 }

public void harvest()
{
  move();
  pickBeeper();
}
  public static void main (String[] args)
  {
    World.readWorld("worlds/fig3-5.kwld");
    World.setVisible(true);
    World.setDelay(20);
    //World.showSpeedControl(true);
    Choreographer boss = new Choreographer(5,10,West,10);
    
    boss.harvest();
    boss.nextRow();
    boss.harvest();
    boss.nextRow();
    boss.harvest();
    boss.nextRow();
    boss.harvest();
    
    boss.turnOff();
    
  
  }
  
}