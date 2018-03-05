import kareltherobot.*;
import java.util.*;

public class ChefBot extends ThanksgivingBot
{

  public void foundRobot()
  {
    Enumeration<ThanksgivingBot> nbr = neighbors();
    
    while ( nbr.hasMoreElements() )
    {
      ThanksgivingBot s = nbr.nextElement();
      
      if ( s.isHelpful() )
      {
        Strategy strat = s.getHelp();
        strat.doIt(this);
        move();
      }
      
      else 
      {Strategy strat = s.noHelp();
        strat.doIt(this);
        move();
      }
    }
  }
  
  public void lookForRelative()
  {
    if ( nextToARobot() ) {
      putBeeper();
      putBeeper();
      foundRobot();
    }
    else {
      move();
      lookForRelative();
    }
  }
  
  public boolean isChef() {
    return true;
  }
  
  public Strategy getHelp() {
    return null;
  }
  
  public Strategy noHelp() {
    return null;
  }
  public ChefBot(int r, int c, Direction d, int b,Strategy strat)
  {
    super(r,c,d,b,strat);
  }
}