import java.util.*;

public class RebuildingTheRebellion{
  public static String instantWinOrLose(int[] data){
    String answer = "";
    if(data[0] == 7 || data[0] == 11){
      answer = "WIN";
    }
    
    if(data[0] == 2 || data[0] == 3 || data[0] == 12){
      answer = "LOSE";
    }   
    return answer;
  }
  
  public static void test_1(){
    int[] test = {11,3,4,5};
    System.out.print("Test 1: ");System.out.print(instantWinOrLose(test)+" ");
  }
  
  public static void test_2(){
    int[] test = {7,3,4,5};
    System.out.print("Test 2: ");System.out.print(instantWinOrLose(test)+ " ");
  }
  
  public static void test_3(){
    int[] test = {13,3,4,5};
    System.out.print("Test 3: ");System.out.print(instantWinOrLose(test));
  }
  
  public static void test_4(){
    int[] test = {2,3,4,5};
    System.out.print("Test 4: ");System.out.print(instantWinOrLose(test)+" ");
  }
  
  public static void test_5(){
    int[] test = {3,3,4,5};
    System.out.print("Test 5: ");System.out.print(instantWinOrLose(test)+" ");
  }
  public static void test_6(){
    int[] test = {12,3,4,5};
    System.out.print("Test 6: ");System.out.print(instantWinOrLose(test)+" ");
  }
  
  public static String craps(int[] data){
    String answer = "";
    for(int i = 1; i < data.length; i++){
      if(data[i] == 7){
        answer = "LOSE";
      }
      if(data[i] == data[0]){
        answer = "WIN";
      }
    }
    return answer;
  }
  
  public static void test_7(){
    int[] test = {12,3,4,7};
    System.out.print("Test 7: ");System.out.print(craps(test)+" ");
  }
  
  public static void test_8(){
    int[] test = {12,3,4,12,13,15};
    System.out.print("Test 8: ");System.out.print(craps(test)+ " ");
  }
  
  public static void test_9(){
    int[] test = {12,3,4,5};
    System.out.print("Test 9: ");System.out.print(craps(test));
  }
  
  public static String RebuildingTheRebellion(){
    Scanner sc = new Scanner(System.in);
    String answer = "";
    int n = sc.nextInt();
    ArrayList<Integer> data1 = new ArrayList<Integer>();
    
    for(int i = 0; i < n; i++){
      int nextSum = sc.nextInt(); 
      data1.add(nextSum);
    }
    int[] data = new int[data1.size()];
    for (int i = 0; i < data.length; i++) {
      data[i] = data1.get(i);
    }
    
    if(instantWinOrLose(data).equals("")){
      answer = craps(data);
    } 
    
    if(!instantWinOrLose(data).equals("")){
      answer = instantWinOrLose(data);
    }
    else{
      answer = "NO DECISION";
    }
    
    System.out.print(" This is answer: ");System.out.print(answer);
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
    
    RebuildingTheRebellion();
  }
}
