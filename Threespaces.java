import kareltherobot.*;
import java.awt.Color;

public class Threespaces extends Make4_2bpick 
{
  
  public void movespaces()
  {
    move();
    move();
    move();
  }

public Threespaces(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
}
  