import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class BinaryInsert{
  
  public static int binaryInsert(ArrayList <Integer> data, Integer num){
    int low = 0;
    int high = data.size() - 1;
    
    while (low <= high) {
      int mid = (low + high) / 2;
      Integer midVal = data.get(mid);
      int cmp = midVal.compareTo(num-1);
      
      if (cmp < 0)
        low = mid + 1;
      else if (cmp > 0)
        high = mid - 1;
      else
        return mid+1;
    }
    return -1;}
  
  public static int binaryInsert2(ArrayList <String> data, String wanted){
    int low = 0;
    int high = data.size() - 1;
    
    while (low <= high) {
      int mid = (low + high) / 2;
      String midVal = data.get(mid);
      if (midVal.equals(wanted)) {
        return mid;
      }
      
      int cmp = midVal.compareTo(wanted);
      if (cmp < 1)
        low = mid + 1;
      else if (cmp > 1)
        high = mid - 1;
      else
        return mid;
    }
    return -1;
  }
  
  public static void main(String[] args){
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(3);
    test.add(5);
    test.add(6);
    test.add(7);
    test.add(8);
    test.add(10);
    System.out.println(binaryInsert(test,4));
    System.out.println(binaryInsert(test,2));
    System.out.println(binaryInsert(test,9));
    System.out.println(binaryInsert(test,101));

    
    ArrayList<String> example = new ArrayList<>();
    example.add("anne");
    example.add("betty");
    example.add("clyde");
    
    System.out.println(binaryInsert2(example,"betty"));
    System.out.println(binaryInsert2(example,"anne"));
    System.out.println(binaryInsert2(example,"clyde"));
    System.out.println(binaryInsert2(example,"infinite loop"));
    System.out.println(binaryInsert2(example,"hard to find infinite loop"));
    System.out.println(binaryInsert2(example,"aardvark is hiding"));
    
  }
}


