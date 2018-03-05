import kareltherobot.*;
import java.awt.Color;

public class DartLeft implements Strategy
{
  public void doIt(UrRobot r)
  {
    r.turnLeft();
    r.move();
  }
}