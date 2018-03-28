import java.util.Arrays;

public class SubArray extends MaxDifference{
  public static void main (String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ints2 = subArray(ints,2,7);
        for(int i:ints2){
      System.out.print(i+" ");
    }
    }

    public static int[] subArray (int[] data,int from, int to) {
      int[] answer = new int[0];
        for (int i = from; i < to; i++) {
            answer = Arrays.copyOfRange(data, from, to);
        }
       return answer; 
    }
 }
