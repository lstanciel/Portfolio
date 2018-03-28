import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class SelectionSort{
  public static int[] selectionSort(int[] data){
    for (int i = 0; i < data.length - 1; i++){ 
      int len = data.length;
      int index = i;
      for (int j = i + 1; j < len; j++){
        if (data[j] < data[index]){ 
          index = j;}
      }
      int smallerNumber = data[index];  
      data[index] = data[i];
      data[i] = smallerNumber;
    }
    return data;
  }

  public static void main(String a[]){
    
    int[] data1 = {10,34,2,56,7,67,88,42};
    int[] data2 = selectionSort(data1);
    for(int i:data2){
      System.out.print(i+" ");
    }
    
    System.out.print("        ");
    int[] data3 = {7,1,3,5,8,12,8,19};
    int[] data4 = selectionSort(data3);
    for(int i:data4){
      System.out.print(i+" ");
    }
}
}