import kareltherobot.*;
import java.awt.Color;

public class Skeleton implements Directions {
  public static void main (String[] args)
  {
    World.readWorld("worlds/fig1-2a.kwld");
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
  }
  
}
