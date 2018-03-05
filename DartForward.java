import kareltherobot.*;
import java.awt.Color;

public class DartForward implements Strategy
{
  public void doIt(UrRobot r)
  {
    r.move();
    r.move();
    r.move();
  }
}