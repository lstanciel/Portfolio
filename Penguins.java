import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Penguins{
   public ArrayList
    penguins(ArrayList<String> input){
    input.add(0,"Antarctic");
    int len = input.size();
    
    for(int i = 1; i < len;i++){
      if((input.get(i)) == "penguin")
        input.add((i-1), "Antarctic");
        input.remove(0);
    }
    return input;}
  
  @Test
  public void test_1 () {
    ArrayList<String> answer = 
      new ArrayList<>();
    
    answer.add("Antarctic");
    answer.add("penguin");
    
    ArrayList<String> input = 
      new ArrayList<>();
    input.add("penguin");
    
    penguins(input); 
    assertArrayEquals(answer.toArray(), input.toArray());
  } 
  
   public ArrayList
    habitat(ArrayList<String> input){
    int len = input.size();
    input.add(1,"habitat");
    for(int i = 1; i < len;i++){
      if(((input.get(i+1)) == "habitat") && (input.get(i)) != "penguin"){
        input.remove(1);
        input.add((i+1), "habitat"); }
      else
      {input.remove(1);}
    }
    
   return input;}
   
   @Test
  public void test_2 () {
    ArrayList<String> answer = 
      new ArrayList<>();

    answer.add("penguin");
    answer.add("habitat");
    
    ArrayList<String> input = 
      new ArrayList<>();
    input.add("penguin");
    
    habitat(input); 
    assertArrayEquals(answer.toArray(), input.toArray());
  } 

      @Test
  public void test_3 () {
    ArrayList<String> answer = 
      new ArrayList<>();

    answer.add("penguin");
    answer.add("habitat");
    
    ArrayList<String> input = 
      new ArrayList<>();
    input.add("habitat");
    input.add("penguin");
    
    habitat(input); 
    assertArrayEquals(answer.toArray(), input.toArray());
  } 
}