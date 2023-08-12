package main.Application;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sort(new int[] {2,1,2})));
	}
	public static int[] sort(int[] arr) {
		//implement
		int var=0;
		int zero=-1;
		int two=arr.length;
//		while((zero<two)&& (var<arr.length)){
//			if((arr[var]==0) && (var<arr.length)){
//				int temp=arr[++zero];
//				arr[zero]=arr[var];
//				arr[var]=temp;	
//			}
//			else if((arr[var]==2)&& (var<two) && (var<arr.length-1)){
//					//if(var!=two) {
//						int temp_1=arr[--two];
//				        arr[two]=arr[var];
//				        arr[var]=temp_1;
////				
//			         	if(arr[var]==0) {
//					    int temp_2=arr[++zero];
//					    arr[zero]=arr[var];
//					    arr[var]=temp_2;
//			         	}
//			         	
//					//}
//					
//					
//				
//			}
//			var++;
//			
//			
//			   //  System.out.println(zero+" "+two+" "+var+" "+Arrays.toString(arr));
//		}
//		
//		return arr;
		  while (var < two) {
	            if (arr[var] == 0) {
	                zero++;
	                int temp = arr[zero];
	                arr[zero] = arr[var];
	                arr[var] = temp;
	                var++;
	            } else if (arr[var] == 2) {
	                two--;
	                int temp = arr[two];
	                arr[two] = arr[var];
	                arr[var] = temp;
	            } else {
	                var++;
	            }

	            System.out.println(zero + " " + two + " " + var + " " + Arrays.toString(arr));
	        }
        return arr;
	}

	public static int[] sort2(int[] arr) {
		int z=-1;
		int o=-1;
		int t=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				if(o!=-1) {	
					//1st swap
					int tmp = arr[o];
					arr[o]=arr[i];
					arr[i]=tmp;
					if(t!=-1) {
						//2nd swap
						tmp = arr[t];
						arr[t] = arr[i];
						arr[i] = tmp;
						t++;
					}
					o++;
				}else if(t!=-1) {
					
					int tmp = arr[t];
					arr[t] = arr[i];
					arr[i] = tmp;
					t++;
				}
			}else if(arr[i]==1) {
				
				if(o==-1) {
					o=t;
				}
				if(t!=-1) {
					int tmp = arr[t];
					arr[t] = arr[i];
					arr[i] = tmp;
					t++;
				}

				
			}else
			{
				if(t==-1) {
					t=i;
				}
			}
			System.out.println(i+" "+o+" "+t+" "+Arrays.toString(arr));
			
		}
		return arr;
	}


}


