public class AlternatingSum{

public static int altSum (int start, int end){ 
int answer = start;
for(int i = start; i < end; i += 3){
   if (i > 2 && i % 2 != 0 && i % 7 /= 0){
        answer+= answer + i;
    } else {
        answer-= answer + i;
    }}}}


  
  
 
  