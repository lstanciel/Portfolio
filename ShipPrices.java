import java.util.*;
import java.util.Arrays;
import java.util.Collection;
public class ShipPrices extends ArrayDelete{
  
  public static int[] median(int[] a){
    int[] answer = {};  
    selectionSort(a);
    int n = a.length;
    if (n % 2 != 0){
      int med = a[n/2]; 
      answer = new int[]{med};
    }
    
    else{
      int first = a[n/2]; 
      int second = a[(n/2)-1];
      answer = new int[]{first, second};
      
    }   
    return answer;    
  }
  
  public static void test_1() {
    int[] data = {1,2,3,4,5,6,7,8};
    int[] answer = median(data);
    for(int i:answer){
      System.out.print(i+" ");}
  }
  public static void test_2() {
    int[] data = {1,2,3,4,5,6,7};
    int[] answer = median(data);
    for(int i:answer){
      System.out.print(i+" ");}
  }
  public static void test_3() {
    int[] data = {414533,4643460,169624,112932,544,5483,217323,9545};
    int[] answer = median(data);
    for(int i:answer){
      System.out.print(i+" ");}
  }
  
  public static String[] getIntegers(String[] array){
    ArrayList<String> temp = new ArrayList<String>();
    for (int i=0; i<array.length; i++) {
      String str = array[i];
      if(isInteger(str) == true){
        temp.add(str);  
      }
    }
    
    String[] result = new String[temp.size()];
    result = (String[]) temp.toArray(new String[temp.size()]);
    
    return result;
  }
  
  public static void test_4(){
    String[] data = {"414533", "Millennium Falcon", "4643460", "Corellian Corvette", "169624", "Slave I"};
    String[] answer = getIntegers(data);
    for(String i:answer){
      System.out.print(i + " ");}
  }
  
  public static String ShipPrices(){
    Scanner sc = new Scanner(System.in);
    String answer = "";
    int n = Integer.parseInt(sc.nextLine());
    ArrayList<Integer> prices1 = new ArrayList<Integer>();
    ArrayList<String> names1 = new ArrayList<String>();
    
    for(int i = 0; i < n; i++) {
      String next = sc.nextLine();   
      int space = next.indexOf(" ");
      int price = Integer.parseInt(next.substring(0, space));
      String name = next.substring(space + 1);
      prices1.add(price);
      names1.add(name);
    }
    
    String[] names = names1.toArray(new String[names1.size()]);
    int[] prices = new int[prices1.size()];
    for (int i = 0; i < prices.length; i++) {
      prices[i] = prices1.get(i);
    }
    
    int[] med = median(prices);
    
    if(med.length == 1){
      int mid = prices1.indexOf(med[0]);
      answer = names[mid];
    }
    else{
      int mid1 = prices1.indexOf(med[1]);
      int mid2 = prices1.indexOf(med[0]);
      String first = names[mid1];
      String second = names[mid2];
      answer = first + " and " + second;
    }
    
    
    
    System.out.print(answer);
    return answer; 
  }
  
  public static void main(String[] args) {
    test_1();
    test_2();
    test_3();
    test_4();
    
    ShipPrices();
  }
  
}
