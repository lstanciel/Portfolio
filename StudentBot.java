import kareltherobot.*;
import java.util.*;

public class StudentBot extends SchoolBot
{
  
  public void foundRobot()
  {
    Enumeration<SchoolBot> nbr = neighbors();
    
    while ( nbr.hasMoreElements() )
    {
      SchoolBot s = nbr.nextElement();
      
      if ( s.isHelpful() )
      {
        Strategy strat = s.getHelp();
        strat.doIt(this);
        turnOff();
      }
    }
  }
  
  public void lookForTeacher()
  {
    if ( nextToARobot() ) {
      foundRobot();
    }
    else {
      move();
      lookForTeacher();
    }
  }
  
  public boolean isStudent() {
    return true;
  }
  
  public Strategy getHelp() {
    return null;
  }
  
  public StudentBot(int r, int c, Direction d, int b)
  {
    super(r,c,d,b);
  }
}