import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
/* Name of the class has to be "Main" only if the class is public. */
public class ShoppingList
{
 public static ArrayList<String> makeShopItems()
 {
  ArrayList<String> shopItems = new ArrayList<String> ();
  shopItems.add("banana");
  shopItems.add("rice");
  shopItems.add("turkey");
  shopItems.add("banana");
  shopItems.add("black beans");
        return shopItems;
 }
 public static ArrayList<Integer> makeShopAmounts()
 {
  ArrayList<Integer> shopItems = new ArrayList<Integer> ();
  shopItems.add(4);
  shopItems.add(128);
  shopItems.add(2);
  shopItems.add(8);
  shopItems.add(5);
        return shopItems;
 }
 
 public static void main (String[] args) throws java.lang.Exception
 {
        ArrayList<String> shopItems = makeShopItems();
        ArrayList<Integer> shopAmounts =makeShopAmounts();
  System.out.println(shopItems);
   System.out.println(shopAmounts);
 
 }
 
 public int amountTotal(ArrayList<String> itemlist, ArrayList<Integer> amounts, String theItem)
 { int len = itemlist.size();
   int answer = 0;
   for(int i = 0; i < len;i++){
      if((itemlist.get(i)) == theItem)
        answer += amounts.get(i);}
   return answer;}
 
  @Test
  public void test_1 () {
    assertEquals(128, amountTotal(makeShopItems(), makeShopAmounts(), "rice"));}
      
  @Test
  public void test_2 () {
    assertEquals(12, amountTotal(makeShopItems(), makeShopAmounts(), "banana"));}     
       
  public ArrayList listEditor(ArrayList<String> itemlist, ArrayList<Integer> amounts, String theItem, int cutoffAmount)
  { int len = itemlist.size();
    for(int i = 0; i < len;i++){
      if(((itemlist.get(i)) == theItem) || (amounts.get(i) < cutoffAmount))
        itemlist.remove(i);
        amounts.remove(i);
  }
    return itemlist;
  }

 @Test
  public void test_3 () { 
   ArrayList<String> answer = 
      new ArrayList<>();
    answer.add("rice");
    answer.remove(1);

  ArrayList<String> itemlist = new ArrayList<String> ();
  itemlist.add("banana");
  itemlist.add("rice");
  itemlist.add("turkey");

  
  ArrayList<Integer> amounts = new ArrayList<Integer> ();
  amounts.add(4);
  amounts.add(128);
  amounts.add(2);

  
  listEditor(itemlist, amounts, "banana", 10);
  
  assertArrayEquals(answer.toArray(), itemlist.toArray());
 }
    
      
  
        
   

 
}