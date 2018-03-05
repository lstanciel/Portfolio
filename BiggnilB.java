public class BiggnilB{
  
//True if the first string appears starting at the first or second index of the second string OR if it appears backwards at the end of the second string but NOT BOTH.
//gnil("Bling", "Big gnilB") => true
//gnil("Big", "BBig Guitar") => true
//gnil("Tele", "TTele fone eleT") => false
  
  public static boolean gnil(String a, String b){
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
    
    if(b.substring((len2 - len), len2).equals(reverseA))
    {answer = false;}
    else
    {answer = true;}
  }}}


