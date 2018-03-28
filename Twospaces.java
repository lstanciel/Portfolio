import kareltherobot.*;
import java.awt.Color;

public class Twospaces extends Make4_2bpick
{
  public void movespaces()
  {
    move();
    move();
  }
  
public Twospaces(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
}
  