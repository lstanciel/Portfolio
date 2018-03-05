import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Chapter13Quiz{
  
  public static void runfast(ArrayList<String> data){
    int len = data.size();
    for(int i = 0; i < len-1;i++){
      String tempOne = data.get(i);
      String tempTwo = data.get(i+1);
      String tempThree = data.get(i+2);
      if(tempOne.equals("I")&&tempTwo.equals("run")&&tempThree.equals("fast"))
        data.add((i),"and");
        data.add((i),"You");
        data.remove(0);
        
    }
    
  }

public static void noMouse(ArrayList<String> school){
   int len = school.size();
    for(int i = 0; i < len-1;i++){
      String tempName = school.get(i);
      if(tempName.equals("mouse") || tempName.equals("mice"))
        school.remove(i);
    }
}

@Test
  public void test_1 () {
  String[] correct = {"You", "and", "I", "run", "fast"};
   
     ArrayList<String> data = 
      new ArrayList<>();
     data.add("I");
     data.add("run");
     data.add("fast");
     
     runfast(data);
     assertArrayEquals(correct, data.toArray());}
    
@Test
  public void test_2 () {
  String[] correct = {"cat"};
  
  ArrayList<String> school = 
      new ArrayList<>();
  school.add("mouse");
  school.add("cat");
  school.add("mice");
  
  noMouse(school);
  assertArrayEquals(correct, school.toArray());}}


  