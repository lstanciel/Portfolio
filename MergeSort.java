import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class MergeSort {
    private ArrayList<Integer> data;  
    public ArrayList<Integer> getSortedArray() {
        return data;
    }

    public MergeSort(ArrayList<Integer> data){
        this.data = data;
    }
     
    public void sortGivenArray(){       
        divide(0, this.data.size()-1);
    }
     
    public void divide(int start,int end){

        if(start < end && (end-start) >= 1){
            int middle = (end + start)/2;
            divide(start, middle);
            divide(middle+1, end);        
            merge(start,middle,end);            
        }       
    }   
     
    public void merge(int start,int middle,int end){
        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();
         
        int left = start;
        int right = middle+1;
         
        while(left <= middle && right <= end){
            if(data.get(left) <= data.get(right)){
                mergedSortedArray.add(data.get(left));
                left++;
            }else{
                mergedSortedArray.add(data.get(right));
                right++;
            }
        }       

        while(left <= middle){
            mergedSortedArray.add(data.get(left));
            left++;
        }
         
        while(right <= end){
            mergedSortedArray.add(data.get(right));
            right++;
        }
         
        int i = 0;
        int j = start;
        while(i < mergedSortedArray.size()){
            data.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }
   public static void main(String[] args) {        
         
        ArrayList<Integer> test = new ArrayList<Integer>();
         
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(0);
        test.add(2);   
        MergeSort ms = new MergeSort(test);

        ms.sortGivenArray();
        
        for(int i:ms.getSortedArray()){
            System.out.print(i+" ");
        }
    }   
}