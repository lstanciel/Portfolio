import java.util.*;

public class Twins1{
  public static boolean isPrime(int num){
    boolean prime = true;
    if(num > 3){
      if((num % 2) == 0){
        prime = false;
      }
      else{
        for(int i=3; i*i <= num; i+= 2){
          if((num % i)== 0){
            prime = false;
          }
        }
      }
    }
    return prime;
  }
  
  public static void test_1(){
    boolean test = isPrime(1);
    System.out.print(test+" ");
  }
  
  public static void test_2(){
    boolean test = isPrime(4);
    System.out.print(test+" ");
  }
  public static void test_3(){
    boolean test = isPrime(71);
    System.out.print(test);
  }
  
  public static String twins(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int pair = 0;
    int num1 = 0;
    int num2 = 0;
    int times = 0;
    
    for(int i=3; pair!=2; i+=2){
      if(isPrime(i) && isPrime(i+2)){
        times+=1;
        if(times==n){
          num1 = i;
          num2 = i+2;
          pair = 2;
        }
      }
    }
    String result = Integer.toString(num1)+", "+String.valueOf(num2);
    System.out.println(result);
    return result;
  }
  
  public static void main(String[] args) {
    test_1();
    test_2();
    test_3();
    
    twins();
  }
}
