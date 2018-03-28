import kareltherobot.*;
import java.awt.Color;

public class Twospaces2 extends Make4_2bput
{
  public void movespaces()
  {
    move();
    move();
  }
  
public Twospaces2(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
}
  