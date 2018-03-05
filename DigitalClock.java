import kareltherobot.*;
import java.awt.Color;

public class DigitalClock
  extends UrRobot
  implements Directions

{
 public DigitalClock(int row, int col, Direction dir, int beep)
  {
    super(row,col,dir,beep);
  }
  
  
public void turnRight()
 {
   turnLeft();
   turnLeft();
   turnLeft();
 }

public void makeOne()
 {
  putBeeper();
  move();
  putBeeper();
  move();
  putBeeper();
  move();
  putBeeper();
  
 }

public void makeZero()
 {
  makeOne();
  turnLeft();
  move();
  putBeeper();
  move();
  putBeeper();
  turnLeft();
  makeOne();
  turnLeft();
  move();
  putBeeper();
  move();
  putBeeper();
  
 }

public void makeFive()
 {
  putBeeper();
  move();
  putBeeper();
  turnLeft();
  move();
  putBeeper();
  turnLeft();
  move();
  putBeeper();
  move();
  putBeeper();
  turnRight();
  move();
  putBeeper();
  turnLeft();
  move();
  putBeeper();
  turnLeft();
  move();
  putBeeper();
  move();
  putBeeper();

 }

public void makeNine()
 {
  makeOne();
  turnLeft();
  move();
  putBeeper();
  move();
  putBeeper();
  turnLeft();
  move();
  putBeeper();
  move();
  putBeeper();
  turnLeft();
  move();
  putBeeper();
  move();
  putBeeper();
  
 }

public void makeColon()
 { 
  move();
  putBeeper();
  move();
  putBeeper();
  
 }

public static void main(String[] args)
 { 
  World.setSize(10,21);
  World.setVisible(true);
  
  DigitalClock jack = new DigitalClock(4, 1, South, 30);
  
  jack.makeOne();
  jack.turnLeft();
  jack.move();
  jack.move();
  jack.turnLeft();
  jack.makeZero();
  jack.turnRight();
  jack.move();
  jack.move();
  jack.turnRight();
  jack.makeColon();
  jack.turnRight();
  jack.move();
  jack.move();
  jack.turnRight();
  jack.makeFive();
  jack.turnRight();
  jack.turnRight();
  jack.move();
  jack.move();
  jack.makeNine();
  jack.turnOff();
  
 }}
  
  
  
  
  
  
  
  