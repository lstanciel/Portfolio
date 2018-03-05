import kareltherobot.*;
import java.awt.Color;

public class FishBot extends StrategyLayer {
  private Strategy sMain,sAlt;
  
  public FishBot(int r, int c, Direction d, int beep, 
                 Strategy strat, Strategy altStrat)
  {
    super(r,c,d,beep,strat);
    sMain = strat;
    sAlt = altStrat;
  }
  
  public void swapStrategy()
  {
    setStrategy(sAlt);
    
    Strategy help = sMain;
    sMain = sAlt;
    sAlt = help;
  }

  public void swim()
  {
    move();
    move();
  }
  
  public void startle()
  {
    doStrat();
    swapStrategy();
  }
  
  public static void main(String[] args)
  {
    World.setVisible(true);
    World.setDelay(75);
    
    Strategy flee = new DartForward();
    Strategy dodge = new DartLeft();
    FishBot dory = new FishBot(4,1,East,10,flee,dodge);
    
    dory.startle();
    dory.startle();
    
    dory.turnOff();
  }
}