import kareltherobot.*;
import java.awt.Color;

public class BirdBot extends StrategyLayer {
  public BirdBot(int r, int c, Direction d, int beep, Strategy strat)
  {
    super(r,c,d,beep,strat);
  }

  public void fly()
  {
    move();
    move();
    move();
  }
  
  public static void main (String[] args) {
  GoFarStrat flyFar = new GoFarStrat();
  BirdBot robin = new BirdBot(4,1,East,20, flyFar);
  flyFar.doIt(robin);
}
}