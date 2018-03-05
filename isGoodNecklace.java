public class isGoodNecklace{
public static boolean isGoodNecklace(String s) { 
int firstClasp = s.indexOf("clasp");
int lastClasp = s.lastIndexOf("clasp");
String between = s.substring(firstClasp, lastClasp);
if ((between.length%2).equals(0));
else 
return false;}

}

