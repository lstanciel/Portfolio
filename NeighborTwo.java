import kareltherobot.*;
import java.awt.Color;

public class NeighborTwo extends NeighborOne implements BeeperPutter
{
  private BeeperPutter neighbor = null;

  
  public void swarm()
  {
    putBeeper();
    move();
    neighbor.swarm();
    neighbor.swarm();
  }

public NeighborTwo (int row, int col, Direction dir, int beep, BeeperPutter twoRobot)
{
  super(row,col,dir,beep);
  BeeperPutter neighbor = twoRobot;
}
}