import java.lang.*;
import java.util.*;

/* JUnit Boilerplate (copy and paste) */
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/* Note: DrJava has JUnit 4.7 bundled. (Current is 4.13) */


public class HospitalTest {
    private String data;
    private int secs;
    private int correct;
    
    public static int countHeartbeat(String s){
      String heart = s.replaceAll("i", ""); 
      return heart.length(); 
      }
    
    @Test
    public void test_countHeartbeat(){
      assertEquals(1,HospitalTest.countHeartbeat("hii"));
    }  

    public static int countIV(String s){
      String iv = s.replaceAll("h", "");
      return iv.length();
    }
    
     @Test
    public void test_countIV(){
      assertEquals(2,HospitalTest.countIV("hii"));
    }  
     
    public static String between(String value, String a, String b) {
        int posA = value.indexOf(a);
        if (posA == -1) {
            return "";
        }
        int posB = value.lastIndexOf(b);
        if (posB == -1) {
            return "";
        }
        int adjustedPosA = posA + a.length();
        if (adjustedPosA >= posB) {
            return "";
        }
        return value.substring((adjustedPosA - 4), (posB+4));
    }
    
    @Test
    public void test_between(){
      assertEquals("iiihhihiii",HospitalTest.between("hhiiihhihiiihhi","iiih","hiii"));
    }
    
   public static String removeTrash(String s){
       String bet = between(s,"iiih","hiii");
       return s.replace(bet, "");  
    }
     
     @Test
    public void test_removeTrash(){
      assertEquals("hhhhi", HospitalTest.removeTrash("hhiiihhihiiihhi"));
    }
     
     public static int level(String d,int secs){
       String data = removeTrash(d);
       int pulse = (countHeartbeat(data)/secs); 
       int ivRate = (countIV(data)/countHeartbeat(data));
       
       if((pulse >= 1) && (ivRate >= 1.5))
         return 0;
       
       if((pulse < 0.83) || (ivRate < 1.5))
         return 2;
       
       else
         return 1;
     }  
     
     @Test
     public void test_level(){
       assertEquals(0, HospitalTest.level("hii",1));}
    }
  



  


    