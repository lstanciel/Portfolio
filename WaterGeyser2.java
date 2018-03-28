import java.io.*;
import java.util.*;
public class WaterGeyser2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  int[] values = new int[n];
  for(int i = 0; i < n; i++){
   values[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> keeper = new ArrayList<Integer>();
        
        boolean increase = false;
        boolean decrease = false;
        int greatestDiff = 0;
        int startIncrease = 0;
        int startDecrease = 0;
        int endIncrease = 1;
        int endDecrease = 1;

        for (int i = 0; i + 1 < n; i++) {
            if ((values[i] < values[i + 1]) && (! increase)) {
                increase = true;
                decrease = false;
                endIncrease = i + 1;
                startIncrease =  i;
            }
            
            else if ((values[i] > values[i + 1]) && (! decrease)) {
                decrease = true;
                increase = false;
                endDecrease = i + 1;
                startDecrease = i;
            }
            
            else if (values[i] == values[i+1]) {
                decrease = false;
                increase = false;
            }
            
            if (increase) {
                endIncrease = i + 1;
                keeper.add(values[endIncrease] - values[startIncrease]);
            }
            
            else if (decrease) {
                endDecrease = i + 1;
                keeper.add(values[startDecrease] - values[endDecrease]);
            }
        }
        
        
        System.out.println(Collections.max(keeper));
    }
}