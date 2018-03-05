import kareltherobot.*;
import java.awt.Color;

public abstract class Make4_2bput extends UrRobot {
  
  public Make4_2bput(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
  
  public abstract void movespaces();


public void layBeepers()
  { 
    putBeeper();
    movespaces();
    putBeeper();
    movespaces();
    putBeeper();
  }
  
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
  
  Make4_2bput jane = null;
  jane = new Twospaces2(1,2,East,3);
  jane.layBeepers();
  jane.move();
  jane.turnOff();
  jane = new Threespaces2(3,2,East,3);
  jane.layBeepers();
  jane.move();
  jane.turnOff();
  jane = new Threespaces2(5,2,East,3);
  jane.layBeepers();
  jane.move();
  jane.turnOff();
  }}
