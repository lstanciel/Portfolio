import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Aardvark {
  
  public ArrayList
    aa(ArrayList<String> input){
    input.add(0,"avoid");
    int len = input.size();
    
    for(int i = 1; i < len;i++){
      if((input.get(i)) == "aardvark")
        input.add((i-1), "avoid");
        input.remove(0);
    }
    return input;}
  
  @Test
  public void test_1 () {
    ArrayList<String> answer = 
      new ArrayList<>();
    
    answer.add("avoid");
    answer.add("aardvark");
    
    ArrayList<String> input = 
      new ArrayList<>();
    input.add("aardvark");
    
    aa(input);
    
    assertArrayEquals(answer.toArray(), input.toArray());
  }                
}