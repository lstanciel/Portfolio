import kareltherobot.*;

public abstract class ThanksgivingBot extends StrategyLayer
{
  public abstract boolean isChef();
  
  public boolean isRelative() { 
    return ! isChef();
  }
  
  public abstract Strategy getHelp();
  public abstract Strategy noHelp();
 

 public boolean isHelpful()
  { if (anyBeepersInBeeperBag ())
    return noHelp() != null;
    
  else
    return getHelp() != null;
  }
 
  public void goToKitchen()
  {
    turnLeft();
    move();
    move();
    move();
    move();
  }


  public ThanksgivingBot(int r, int c, Direction d, int b, Strategy strat)
  {
    super(r,c,d,b,strat);
  }
    
  public static void main(String[] args)
  {
    World.setVisible(true);
    World.setDelay(50);
    Strategy cook = new DoNothing();
    ChefBot helpless = new ChefBot(4,1,East,3,cook);
    ChefBot chef = new ChefBot(5,5,South,3,cook);
    Strategy cleanup = new DoDishesStrat();
    RelativeBot goodRelative = new RelativeBot(4,5,North,0,cleanup);
    Strategy lazy = new WatchTV();
    RelativeBot badRelative = new RelativeBot(4,4,North,5,lazy);
    chef.lookForRelative();
    helpless.lookForRelative();
    chef.turnOff();
    helpless.turnOff();
} 
}