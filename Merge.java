import java.lang.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Merge{
public static int[] merge(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    int i = 0;
    for (int x : a) { c[i] = x; i ++; }
    for (int x : b) { c[i] = x; i ++; }
    return c;
  }
}