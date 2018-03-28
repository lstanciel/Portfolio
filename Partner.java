import kareltherobot.*;
import java.awt.Color;

public interface Partner {
  public void UrRobot spouse();
  public void setSpouse(Partner x);
  public boolean isAvailable();
}