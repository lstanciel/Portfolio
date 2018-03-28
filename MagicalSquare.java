import java.util.*;

public class MagicalSquare {
  
  public static String normal(int[][] data,int size){
    String answer = "";
    for(int i = 0; i < size; i++){
      int num = data[i][size-1];
      int sizeSqr = size*size;
      if(num <= sizeSqr){
        answer = "Normal";}
      else
        answer = "Not Normal";
    }
    return answer;
  }
  
  public static void test_1() {
    int[][]data = {{1, 2},{3,4}};
    int size = 2;
    System.out.println(normal(data, size));
  }
  public static void test_2() {
    int[][]data = {{1, 2},{3,12}};
    int size = 2;
    System.out.println(normal(data, size));
  } 
  
  public static int diagonalSum(int[][] data, int size){
    int len = data.length;
    int diagSum1 = 0;
    int diagSum2 = 0;
    int j = 0;
    int k = 0;
    int answer = 0;
    for (j = 0; j < len; j++) {
      diagSum1 = diagSum1 + data[j][j];
    }
    k = len - 1;
    for (j = 0; j < len; j++) {
      if (k >= 0) {
        diagSum2= diagSum2 + data[j][k];
        k--;
      }
    }
    if(diagSum1 == diagSum2){
      answer = diagSum1;}
    return answer; 
  }
  
  public static void test_3(){
    int[][] data = {{4, 9, 2,},{3, 5, 7},{8, 1, 6}};
    int size = 3;
    System.out.println(diagonalSum(data, size));
  } 
  
  public static int rowSum(int[][] data, int size){
    int len = data.length;
    int[] rowSum = new int[size];
    for (int a = 0; a < data[0].length; a++){
      for (int b = 0; b < len; b++)
      {   
        rowSum[a] += data[b][a];
      }
    }
    return rowSum[0];
  }
  
  public static void test_4(){
    int[][] data = {{4, 9, 2,},{3, 5, 7},{8, 1, 6}};
    int size = 3;
    System.out.println(rowSum(data, size));
  }
  public static int colSum(int [][] data, int size){
    int len = data.length;
    int[] colSum = new int[size];
    for (int a = 0; a < data[0].length; a++){
      for (int b = 0; b < len; b++)
      {   
        colSum[a] += data[b][a];
      }
    }
    return colSum[0];
  }
  
  public static void test_5(){
    int[][] data = {{4, 9, 2,},{3, 5, 7},{8, 1, 6}};
    int size = 3;
    System.out.println(colSum(data, size));
  }
  public static String magical(int[][] data,int size){
    int len = data.length;
    int colSum = 0;
    int sum = 0;
    String answer = "";
    
    if(colSum(data, size) == rowSum(data, size) && colSum(data, size) == diagonalSum(data, size)){
      answer = "Magic";}
    else{
      answer = "Not Magic";
    }
    return answer; 
  }
  
  public static void test_6(){
    int[][] data = {{1, 3},{2, 4}};
    int size = 2;
    System.out.println(magical(data, size));
  }
  public static void test_7(){
    int[][] data = {{23, 28, 21},{22, 24, 26},{27, 20, 25}};
    int size = 3;
    System.out.println(magical(data, size));
  }
  
  public static String MagicalSquare(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String answer = "";
    int[][] square = new int[n][n];
    
    for(int row = 0; row < n; row++) {
      for(int col = 0; col < n; col++) {
        square[row][col] = sc.nextInt();
      }
    }
    System.out.println(Arrays.deepToString(square));
    
    for(int row = 0; row < n; row++) {
      for(int col = 0; col < n; col++) {
        if(((magical(square, n)).equals("Magic")) && ((normal(square, n)).equals("Normal"))){
          answer = "Normal Magic Square";
        }
        else{
          if(((magical(square, n)).compareTo("Magic")) == 0){
            answer = "Magic Square";
          }
          if(((normal(square, n)).compareTo("Normal")) == 0){ 
            answer = "Normal Square";
          }
        }
        if((((magical(square, n)).compareTo("Magic")) != 0) && (((normal(square, n)).compareTo("Normal")) != 0))
            answer = "Square";
        }
      }
    System.out.println(answer);
    return answer;
    
  }
  
  
  public static void main(String[] args) {
    test_1();
    test_2();
    test_3();
    test_4();
    test_5();
    test_6();
    test_7();
    MagicalSquare();
  }
}
