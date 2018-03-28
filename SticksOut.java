import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
import java.util.Arrays;
// You can put all of your tests in one class.
public class SticksOut {

    public boolean alphabeticalOrder(String[] args) {
    for(int i = 1; i < args.size(); i++) 
        if (args.get(i).compareTo(args.get(i - 1)) >= 1) 
          return false;
    return true;
}

    @Test
    public void test_alphabeticalOrder(){
      String[] test = {"alfa","bravo","charlie"};
      String[] answer = alphabeticalOrder(test);
      assertArrayEquals(test,answer);
}

    public static String[] sticksOut(String[] xs)
    { int len = xs.len();
      String[] result = new String [len];
      
      if((len < 3) || (alphabeticalOrder(xs).equals(true)))
        result = xs;
      
      else
        for(int i = 1; i > len-1; i++){
        if(xs[i-1] 
}
      return result;
      }

    @Test
    public void test_trivial() {
        String[] xs = { };
        String[] answer = sticksOut(xs);
        assertArrayEquals(xs,answer);
        assertEquals(0, xs.length);
    }
    @Test
    public void test_one() {
        String[] xs = { "a" };
        String[] answer = sticksOut(xs);
        assertArrayEquals(xs,answer);
        assertEquals(1, xs.length);
        xs[0] = "b";
        assertFalse(xs[0].equals(answer[0]));
    }
    
 @Test
    public void test_one() {
        String[] xs = { "b" };
        String[] answer = sticksOut(xs);
        assertArrayEquals(xs,answer);
        assertEquals(1, xs.length);
        xs[0] = "c";
        assertFalse(xs[0].equals(answer[0]));
    }
 
  @Test
    public void test_one() {
        String[] xs = { "c" };
        String[] answer = sticksOut(xs);
        assertArrayEquals(xs,answer);
        assertEquals(1, xs.length);
        xs[0] = "d";
        assertFalse(xs[0].equals(answer[0]));
    }
  
    public static void main (String[] args)
    {
        org.junit.runner.JUnitCore.main("SticksOut");
    }

}