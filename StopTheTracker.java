import java.util.*;

public class StopTheTracker {
  
  public static void main(String[] args) {
    StopTheTracker();
  }
  
  public static String StopTheTracker(){
    String answer = "";
    Scanner sc = new Scanner(System.in);
    
    String complex = sc.nextLine();
    int n = Integer.parseInt(sc.nextLine());
    
    int plusPos = complex.indexOf("+");
    
    int a = Integer.parseInt(complex.substring(0, plusPos-1));
    int b = Integer.parseInt(complex.substring(plusPos+2, complex.length()-1));
    int c = Integer.parseInt(complex.substring(0, plusPos-1));
    int d = Integer.parseInt(complex.substring(plusPos+2, complex.length()-1));
    
    for(int j = 0; j < n; j++){
      if(n == 2){
        int real = (a*c - b*d);
        int imaginary = (a*d + c*b);
        answer = real + "+" + imaginary+"i";
      }
      else{
        double real = Math.pow(a,n) + a*Math.pow(b,n-1)*-1 + a*Math.pow(b,n-1)*-1 + a*Math.pow(b,n-1);
        double imaginary = Math.pow(a, n-1)*d + Math.pow(a, n-1)*b + Math.pow(b,n);
        answer = real + "+" + imaginary+"i";
      }
    }  
    System.out.print(answer);
    return answer;   
  }
}
