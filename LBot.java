import kareltherobot.*;
import java.awt.Color;

public class LBot extends UrRobot implements Partner{
  private Partner myPartner = null;
   public LBot(int row, int col, Direction dir, int beep,Partner s)
  {
    super(row,col,dir,beep);
    myPartner = s;
  }

 public void setSpouse (Partner s) 
  {
    myPartner = s;
  }

 public boolean isAvailable;
 {if (myParnter.getSpouse ()) == null) = true}

   
 public void getSpouse
  { 

  
