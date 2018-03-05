import kareltherobot.*;
import java.awt.Color;

public class NeighborOne extends UrRobot implements BeeperPutter
{
  private BeeperPutter neighbor = null;
  
  public void swarm()
  {
    putBeeper();
    move();
    neighbor.swarm();
  }
  
public NeighborOne (int row, int col, Direction dir, int beep, BeeperPutter oneRobot)
{
  super(row,col,dir,beep);
  BeeperPutter neighbor = oneRobot;
}
}

