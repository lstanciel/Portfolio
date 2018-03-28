import kareltherobot.*;
import java.util.*;

public class RelativeBot extends SchoolBot
{
  public boolean isChef() {
    return false;
  }
  
  public Strategy getHelp() {
    System.out.println("Relative: I am happy to help you.");
    putBeeper();
    move();
    return new GetBeeperStrat();
  }
  
  public RelativeBot(int r, int c, Direction d, int b)
  {
    super(r,c,d,b);
  }
  
  public static void main(String[] args)
  {
    World.setVisible(true);
    World.setDelay(50);
    ChefBot helpless = new ChefBot(4,1,East,0);
    RelativeBot goodRelative = new RelativeBot(4,5,North,3);
    helpless.lookForRelative();
    goodRelative.bow();
  }
}