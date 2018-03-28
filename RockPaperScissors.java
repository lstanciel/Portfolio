import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
//A int[] with two values between 1 and 3 is inputed into the scanner, then the winner is outputed in string form.
public class RockPaperScissors{
  public static void main(String[] args) {
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(3);
    test_1();
    test_2();
    test_3();
    RockPaperScissors(test);
  }
  
  public static String rockWin(ArrayList<Integer> data1){
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    String answer = "";
    int len = data1.size();
    for(int i = 0; i < len-1; i++){
      if((data1.get(i).equals(rock) && data1.get(i+1).equals(scissors)) || (data1.get(i+1).equals(rock) && data1.get(i).equals(scissors))){
        answer = "Rock";
      }
      else
        answer = "";
    }
    return answer;
  }
  
  public static void test_1(){
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(3);
    System.out.print("Test 1: ");System.out.print(rockWin(test)+" ");
  }
  
  public static String paperWin(ArrayList data1){
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    int len = data1.size();
    String answer = "";
    for(int i = 0; i < len-1; i++){
      if((data1.get(i).equals(paper) && data1.get(i+1).equals(rock)) || (data1.get(i+1).equals(paper) && data1.get(i).equals(rock))){
        answer = "Paper";
      }
      else
        answer = "";
    }
    return answer;
  }
  
  public static void test_2(){
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(2);
    System.out.print("Test 2: ");System.out.print(paperWin(test)+" ");
  }
  public static String scissorsWin(ArrayList data1){
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    int len = data1.size();
    String answer = "";
    for(int i = 0; i < len-1; i++){
      if((data1.get(i).equals(paper) && data1.get(i+1).equals(scissors)) || (data1.get(i+1).equals(paper) && data1.get(i).equals(scissors))){
        answer = "Scissors";
      }
      else
        answer = "";
    }
    return answer;
  }
  
  public static void test_3(){
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(2);
    test.add(3);
    System.out.print("Test 3: ");System.out.print(scissorsWin(test)+" ");
  }
  
  
  public static String RockPaperScissors(ArrayList<Integer> data1){
    String answer = "";
    int rock = 1;
    //rock beats scissors
    int paper = 2;
    //paper beats rock
    int scissors = 3;
    //scissors beats paper
    
    if(rockWin(data1).equals("Rock")){
      answer = "Rock";
    }
    
    if(scissorsWin(data1).equals("Scissors")){
      answer = "Scissors";
    }
    
    if(paperWin(data1).equals("Paper")){
      answer = "Paper";
    }
    
    System.out.println("The winner is: "+ answer);
    return answer;
  }
}
