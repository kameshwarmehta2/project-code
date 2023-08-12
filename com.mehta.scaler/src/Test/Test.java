package Test;
import java.util.Arrays;

public class Test {
    public int solve(int[] A) {
     Arrays.sort(A);
     int max=A[A.length-1];
     int min=A[0];
     int count=0;
     int sec_max=0;
     int sec_min=0;
      
     for(int i=1;i<A.length;i++){
          if(A[i]>min){
              sec_min=i;
              break;
          }
      }
     for(int i=A.length-2;i>=0;i--){
          if(A[i]<max){
              sec_max=i;
              break;
          }
     }
     
    if(sec_max!=0)
        count=(sec_max-sec_min)+1;

     return count;
     
    }
}

