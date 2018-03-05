import kareltherobot.*;
import java.awt.Color;

public class NoNeighbor extends NeighborTwo implements BeeperPutter
{
public void swarm()
{
  putBeeper();
  move();
}

public NoNeighbor (int row, int col, Direction dir, int beep)
{
  super(row,col,dir,beep);
}

public static void main (String[] args)
  {
   BeeperPutter aRobot = new NoNeighbor(1, 1, North, 1);
   BeeperPutter aRobot = new NoNeighbor(3, 5, North, 1);
   aRobot = new NeighborOne(1, 2, North, aRobot);
   aRobot = new NeighborTwo(1, 3, North, aRobot);
   
   aRobot.swarm();
}

}

  