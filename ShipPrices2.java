import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ShipPrices2 {
    

    public static void main(String[] args) {
    }
    
    public static void mids(){
    Scanner sc = new Scanner(System.in);
        
    int n = Integer.parseInt(sc.nextLine());
    ArrayList<Integer> prices = new ArrayList<Integer>();
    ArrayList<String> names = new ArrayList<String>();
    
    for(int i = 0; i < n; i++) {
      String next = sc.nextLine();   
      int space = next.indexOf(" ");
      int price = Integer.parseInt(next.substring(0, space));
      String name = next.substring(space + 1);
      prices.add(price);
      names.add(name);
    }
    int min=0;
    for(int i=0;i<prices.size();i++){
        min=prices.get(i);
        System.out.println(i);
        for(int k=0;k<i;k++){
          System.out.println(k);
            if(min>prices.get(k)){
                prices.remove(i);
                names.add(k,names.get(i));
                names.remove(i+1);
                prices.add(k,min);
                k=i;
                System.out.println(names);
            }
        }
        System.out.println(min);
    }
    if(n%2!=0) System.out.println(names.get(n/2));
    else System.out.println(names.get(n/2)+" and "+names.get(n/2 -1));
    }
}