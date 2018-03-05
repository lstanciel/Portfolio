import kareltherobot.*;
import java.awt.Color;

public abstract class Make4_2bpick extends UrRobot {
  
  public Make4_2bpick(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
  
  public abstract void movespaces();
  
  public void takeBeepers()
  { 
    pickBeeper();
    movespaces();
    pickBeeper();
    movespaces();
    pickBeeper();
  }
  
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
  
  Make4_2bpick jane = null;
  jane = new Twospaces(1,2,East,3);
  jane.takeBeepers();
  jane = new Threespaces(3,2,East,3);
  jane.takeBeepers();
  jane = new Threespaces(5,2,East,3);
  jane.takeBeepers();
  }}
