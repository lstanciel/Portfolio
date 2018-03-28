import java.util.Scanner;

public class WaterGeysers extends SubArray{
  public static boolean isIncreasing(int[] data) {
    int len = data.length;
    for(int i=0 ; i < len - 1; i++) { 
      if (data[i] > data[i+1]) {
        return false; 
      }
    }    
    return true; 
  }
  
  public static void test_1() {
    int[]data = {1,2,3,4};
    System.out.println(isIncreasing(data));
  }
  
  public static void test_2() {
    int[]data = {4,3,2,1};
    System.out.println(isIncreasing(data));
  }
  
  public static boolean isDecreasing(int[] data) {
    int len = data.length;
    for(int i=0 ; i < len - 1; i++) { 
      if (data[i] < data[i+1]) {
        return false; 
      }
    }    
    return true; 
  }
  
  public static void test_3() {
    int[]data = {1,3,3,7};
    System.out.println(isDecreasing(data));
  }
  
  public static void test_4() {
    int[]data = {4,3,2,1};
    System.out.println(isDecreasing(data));
  }
  
  public static int constant(int[] data){
    int len = data.length;
    int answer = 0;
    if(isIncreasing(data)){
      answer = (data[len-1] - data[0]);
    }
    if(isDecreasing(data)){
      answer = (data[0] - data[len-1]);
    }
    return answer;}
  
  public static void test_5() {
    int[]data = {1,2,3,4};
    System.out.println(constant(data));
  }
  
  public static void test_6() {
    int[]data = {4,3,2,1};
    System.out.println(constant(data));
  }
  
  public static int findDecrease(int[] data){
    int answer = 0;
    for (int i = 1; i <data.length ; i++) {
      if(data[i]<data[i-1]){
        answer = data[i-1];
      }
    }
    return answer;
  }
  
  public static void test_7() {
    int[]data = {1,3,6,4,8};
    System.out.println(findDecrease(data));
  }
  
  public static int findIncrease(int[] data){
    int answer = 0;
    for (int i = 1; i <data.length ; i++) {
      if(data[i]>data[i-1]){
        answer = data[i];
      }
    }
    return answer;
  }  
  
  public static void test_8() {
    int[]data = {8,4,6,3,1};
    System.out.println(findIncrease(data));
  }
  
  public static int increasing(int[] data){
    int len = data.length;
    int answer = 0;
    for (int i = 1; i < len ; i++) {
      int change = findIncrease(data);
      System.out.println(change);
      int[] front = subArray(data,0,change);  
      int[] back = subArray(data,change,len-change);
      int front1 = MaxDifference(front);
      System.out.println(front);
      int back1 = MaxDifference(back);
      System.out.println(back);
      answer = getMax(front1,back1);
    }
    return answer;
  }
  
  public static void test_9() {
    int[]data = {1, 3, 6, 4, 8};
    System.out.println(increasing(data));
  }
  
  public static int decreasing(int[] data){
    int len = data.length;
    int answer = 0;
    for (int i = 1; i < len ; i++) {
      int change = findDecrease(data);
      int[] front = subArray(data,0,change);
      int[] back = subArray(data,change, len-1);
      int front1 = MaxDifference(front);
      int back1 = MaxDifference(back);
      answer = getMax(front1,back1);
    }
    return answer;
  }
  
  public static void test_10() {
    int[]data = {7,4,3,5,6};
    System.out.println(decreasing(data));
  }
  
  public static int getMax(int a,int b){
    if (a > b) {
      return a;
    }
    else
      return b;
  }
  public static void test_11() {
    System.out.println(getMax(29,19));
  } 
  
  public static int WaterGeyers(){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int answer = 0;
    int[] values = new int[n];
    
    for(int i = 0; i < n; i++) {
      values[i] = scanner.nextInt();
      int len = values.length;
      
      for(int j = 0; j < n; j++){
        if(isIncreasing(values) == true) 
          answer = constant(values);  
      }
      if(isDecreasing(values) == true){
        answer = constant(values);
      }
      else{
        int[] start = new int[] {values[0], values[1]};
        if(isIncreasing(start)){
          answer = increasing(values);
        }
        if(isDecreasing(start)){
          answer = decreasing(values);  
        }   
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
    test_8();
    test_9();
    test_10();
    test_11();
    WaterGeyers();
  }
}
