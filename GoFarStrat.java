import kareltherobot.*;
import java.awt.Color;

public class GoFarStrat implements Strategy{
  
public void doIt(UrRobot r)
 {
  BirdBot b = (BirdBot) r;
  
  b.fly();
  b.fly();
  b.fly();
 }

}