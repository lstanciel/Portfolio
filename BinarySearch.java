import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class BinarySearch{
  public static int binary(ArrayList <Integer> data, Integer num){
    int low = 0;
    int high = data.size() - 1;
    
    while (low <= high) {
      int mid = (low + high) / 2;
      Integer midVal = data.get(mid);
      int cmp = midVal.compareTo(num);
      
      if (cmp < 0)
        low = mid + 1;
      else if (cmp > 0)
        high = mid - 1;
      else
        return mid;
    }
    return -1;
  }
  
  
  public static void main(String[] args){
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(2);
    test.add(3);
    test.add(4);
    test.add(5);
    test.add(6);
    test.add(7);
    test.add(8);
    test.add(9);
    test.add(10);
    System.out.println(binary(test,4));
    System.out.println(binary(test,2));
    System.out.println(binary(test,9));
    System.out.println(binary(test,101));
    
  }
}





