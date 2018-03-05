import kareltherobot.*;

public class DoDishesStrat implements Strategy
{
  public void doIt (UrRobot r)
  {
    r.pickBeeper();
    r.pickBeeper();
    System.out.println("Chef: Thanks for cleaning up.");
    r.move();
    r.move();
  }
}