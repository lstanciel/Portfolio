import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class BinarySearch2{
  public static int binarySearch2(ArrayList <String> data, String wanted){
    int low = 0;
    int high = data.size() - 1;
    
    while (low <= high) {
      int mid = (low + high) / 2;
      String midVal = data.get(mid);
      if (midVal.equals(wanted)) {
        return mid;
      }
      
      int cmp = midVal.compareTo(wanted);
      if (cmp < 0)
        low = mid + 1;
      else if (cmp > 0)
        high = mid - 1;
      else
        return mid;
    }
    return -1;
  }
  
  public static void main(String[] args)
  {
    ArrayList<String> example = new ArrayList<>();
    example.add("anne");
    example.add("betty");
    example.add("clyde");
    
    System.out.println(binarySearch2(example,"betty"));
    System.out.println(binarySearch2(example,"anne"));
    System.out.println(binarySearch2(example,"clyde"));
    System.out.println(binarySearch2(example,"infinite loop"));
    System.out.println(binarySearch2(example,"b hard to find infinite loop"));
    System.out.println(binarySearch2(example,"aardvark is hiding"));
  }
}
