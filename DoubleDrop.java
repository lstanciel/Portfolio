import kareltherobot.*;
import java.awt.Color;

public class DoubleDrop
  extends UrRobot
  implements Directions

{
 public DoubleDrop(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
  
 @Override
 public void putBeeper()
 {
   super.putBeeper();
   super.putBeeper();
 }
 
 public static void main(String[] args)
 {
   World.readWorld("worlds/fig1-2a.kwld");
   World.setVisible(true);
   World.setDelay(100);
   
   DoubleDrop x = new DoubleDrop(1,1,North, 4);
   x.putBeeper();
   x.move();
   x.turnOff();
 }}
                               