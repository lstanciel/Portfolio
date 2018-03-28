import kareltherobot.*;

public class WatchTV implements Strategy
{
  public void doIt (UrRobot r)
  {
    r.putBeeper();
    System.out.println("Relative: I was actually about to watch TV.");
    r.move();
    r.move();
    r.move();
  }
}