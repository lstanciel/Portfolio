public class NecklaceQuiz {
  public static void main (String[] args) {
 System.out.println("Testing isGoodNecklace");
 System.out.println("======================");
 iGNTest();
    
 System.out.println("Testing gnil");
 System.out.println("============");
 gnilTest();
    
 System.out.println("Testing altSum");
 System.out.println("==============");
 altSumTest();
  }
  public static void isGoodNecklace1(String s, boolean correct) {
 boolean ans = isGoodNecklace(s);
 String result = "Fail";
 if (correct == ans ) {
   result="Pass";
 }
 System.out.println("iGN("+s+") "+result);
  }
  public static void iGNTest() {
 isGoodNecklace1("clasp pendant pendant pendant clasp", false);
 isGoodNecklace1("clasp pendant pendant pendant pendant clasp", true);
 isGoodNecklace1("clasp pendant clasp pendant pendant clasp", false);
 isGoodNecklace1("pendant clasp pendant pendant pendant clasp", false);
 isGoodNecklace1("pendant clasp pendant pendant pendant clasp pendant clasp", true);
 isGoodNecklace1("claspendant pendant pendant clasp pendant ",true);
    
 String c = "clasp";
 String p = "pendant";
 isGoodNecklace1(p + c + c + c + c + p + c + p + c + p + c + p + c, true);
 isGoodNecklace1(p + c + c + c + c + p + c + p + c + p + c + p + c + p , true);
 isGoodNecklace1(c + c + c + c + p + c + p + c + p + c + p + c+p, true);
 isGoodNecklace1(c + c + c + c + p + c + p + c + p + c + p + c+p+p, true);
  }
  public static void gnil1(String a, String b, boolean correct)
  {
 boolean ans = gnil(a,b);
 String result = "Fail";
 if (correct == ans ) {
   result="Pass";
 }
 System.out.println("gnil("+a+","+b+") "+result);
  }
  public static void gnilTest() {
 gnil1("Bling", "Big gnilB",true);
 gnil1("Big", "BBig Guitar",true);
 gnil1("Tele", "TTele fone eleT", false);
 gnil1("Good", "Good", true);
 gnil1("good", "Good", false);
 gnil1("good", "good doog", false);
 gnil1("good", "goodoog", false);
 gnil1("good", "!good doog ",true);
  }
  public static void alt1(int s, int e, int correct) {
 int ans = altSum(s,e);
 String result = "Fail";
 if (correct == ans ) {
   result="Pass";
 }
 System.out.println("altSum("+s+","+e+") "+result);
  }
 
  public static void altSumTest() {
 alt1(50, 55, 50-53);
 alt1(50, 57, 50 - 53);
 alt1(50, 60, 50 - 53 + 59);
 alt1(51, 71, 51 - 54 + 57 - 60 + 66 - 69);
  }
 
// THIS IS WHERE YOU SHOULD EDIT AND PUT YOUR CODE
//                         VVVVVVVVVVVVVVVVV
  public static int countMatches(String str, String sub) {
      if (str.length() == 0 || sub.length() == 0) {
          return 0;
      }
      int count = 0;
      int idx = 0;
      while ((idx = str.indexOf(sub, idx)) != -1) {
          count++;
          idx += sub.length();
      }
      return count;
  }
  
  public static boolean isGoodNecklace (String s) {
   int firstClasp = s.indexOf("clasp");
   int lastClasp = s.lastIndexOf("clasp");
   String between = s.substring(firstClasp, lastClasp);
   int p = s.indexOf("pendant");
   int t = s.indexOf("t");
   String pendant = s.substring(p,t);
   countMatches(between, pendant);
   if((countMatches(between, pendant) % 2) == (0));
   return true;}
   
 
  public static boolean gnil (String a, String b) {
  int len = a.length();
  int len2 = b.length();
  boolean answer = false;
  String reverseA = "";
  
  for(int i = 0; i < len; i++){
    reverseA = a.substring(i, i+1) + reverseA;}
  
  if(b.substring(1, len + 1).equals(a)){
    if(b.substring(len2 - len, len2).equals(reverseA))
    {answer = false;}
    else
    {answer = true;}
    return answer;}
  if(b.substring((len2 - len), len2).equals(reverseA))
    {answer = false;}
    else
    {answer = true;}
    return answer;
  }
  
   public static int altSum (int start, int end) {
     int answer = start;
     for(int i = start; i < end; i += 3){
       if ((i > 2) && ((i % 2) != 0) && ((i % 7) != 0))
       {answer+= answer + i;} 
       else
       {answer-= answer - i;}}
   return answer;}

}
