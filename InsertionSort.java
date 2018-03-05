import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class InsertionSort{
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> data){
    int len = data.size();
    for (int i = 0; i <= len - 1; i++) {
        int temp = i;
        for (int j = i; j < len-1; j++) {

            if (data.get(temp) > data.get(j + 1)) {
                temp = j + 1;
            }
        }
    int temp2 = data.get(i);
    int temp3 = data.get(temp);
    data.set(i,temp3);
    data.set(temp, temp2);
  }
  return data;
  }
  
  public static void main(String[] args){
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(3);
    test.add(5);
    test.add(8);
    test.add(6);
    test.add(7);
    test.add(10);
    
    System.out.println(insertionSort(test));
    
   ArrayList<Integer> test2 = new ArrayList<Integer>();
    test2.add(1);
    test2.add(11);
    test2.add(5);
    test2.add(18);
    test2.add(6);
    test2.add(3);
    test2.add(10);
    
    System.out.println(insertionSort(test2)); 
    }
}


