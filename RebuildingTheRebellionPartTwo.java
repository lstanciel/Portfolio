import java.util.*;

public class RebuildingTheRebellionPartTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] board = new int[3][3];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        int n = sc.nextInt();
        
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++) {
            int next = sc.nextInt();
            rolls.add(next);
        }
        
    }

}