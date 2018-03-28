class MaxDifference{
public static int MaxDifference(int[] data){  
    int max = data[0];
    int min = data[0];
    for( int i : data){ 
      if( max < i )
        max = i;
      if( min > i )
        min = i;
    }
    return max-min;
}
   public static void main (String[] args) {
        int[] ints = {1, 3, 6, 4, 8, 1};
        System.out.println(MaxDifference(ints));
        int[] data = {1, 3, 6};
         System.out.println(MaxDifference(data));
}
}