import java.util.*;

class Main {
  public static void main(String[] args) {
    test_isClose();
    test_isClose2();
    test_isClose3();
    BlurryMemory();
    System.out.println("Hello world!");}

//0 <= k <= 255 1 <= n <= 1000 Each pixel value is between 0 and 255 (inclusive)
public static void test_isClose() {
  int [][]data = {{10, 20, 30},{40, 50, 60},{70,80,30}};
  int size = 3;
  int row = 0;
  int col = 1;
  int closeness = 10;
  int numClose = 3;
  System.out.println(isClose(data,size,row,col,closeness));
}
public static void test_isClose2() {
  int [][]data = {{10, 20, 30},{40, 50, 60},{70,80,40}};
  int size = 3;
  int row = 2;
  int col = 2;
  int closeness = 10;
  int numClose = 2;
  System.out.println(isClose(data,size,row,col,closeness));
}
public static void test_isClose3() {
  int [][]data = {{10, 10, 10},{10, 10, 10},{10, 10, 10}};
  int size = 3;
  int row = 2;
  int col = 2;
  int closeness = 10;
  int numClose = 2;
  System.out.println(isClose(data,size,row,col,closeness));
}

  public static boolean isClose(int[][] data,int size, int row, int col, int closeness){
     
   int top = row-1;
   int bottom = row+1;
   int left = col-1;
   int right = col+1;
     
   if(bottom == size){
     bottom = row;
   }
   if(top<0){
     top=0;
   }
   if(left<0){
     left=0;
   }
   if(right==size){
     right=col;
   }
   
   int numClose =0;
   int boxSize = (right+1-left)*(bottom+1-top);
    /*System.out.println(top); 
    System.out.println(bottom); 
    System.out.println(left); 
    System.out.println(right); 
    System.out.println(boxSize); */
   for(int row2=top;row2<bottom+1;row2++){
     for(int col2=left;col2<right+1;col2++){
       if(Math.abs(data[row][col]-data[row2][col2])<=closeness){
         numClose+=1;
       }
     }
   }
   return boxSize==numClose;
 }
 
  public static int BlurryMemory(){
    Scanner sc = new Scanner(System.in);
    
    //k is how close a number is to be considered close 
    int k = sc.nextInt();
    //n is the width and height of the square/picture/array 
    int n = sc.nextInt();
    //answer is what will be outputed 
    int answer = 0;
    
    int[][] pixels = new int[n][n];
          
    for(int row = 0; row < n; row++) {
      for(int col = 0; col < n; col++) {
        pixels[row][col] = sc.nextInt();
      }
    }
    System.out.println(Arrays.deepToString(pixels));
    
    for(int row = 0; row < n; row++) {
      for(int col = 0; col < n; col++) {
        if(isClose(pixels, n, row, col,k)){
          answer+=1;
          System.out.println(isClose(pixels, n, row, col,k));
        }
      }
    }
    System.out.println(answer);
    return answer;
  }
}
  