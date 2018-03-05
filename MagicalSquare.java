import java.util.*;

public class MagicalSquare {
  
  public static boolean normal(int[][] data,int n){
    for(int i = 0; i < n; i++){
      data.contains(n-i);
    }
    return true;
  }
  
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int[][] square = new int[n][n];
      
      for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
        square[i][j] = sc.nextInt();
      
    }
  }