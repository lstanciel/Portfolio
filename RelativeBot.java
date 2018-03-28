import kareltherobot.*;
import java.util.*;

public class RelativeBot extends ThanksgivingBot
{
  public boolean isChef() {
    return false;
  }
  
  public Strategy getHelp() {
    System.out.println("Chef: Can you take these dishes?");
    goToKitchen();
    return new DoDishesStrat();

  }
  
 public Strategy noHelp(){
      System.out.println("Chef: Can you take these dishes?");
      goToKitchen();
      return new WatchTV();
 }
 
  public RelativeBot(int r, int c, Direction d, int b, Strategy strat)
  {
    super(r,c,d,b,strat);
  }
  
}