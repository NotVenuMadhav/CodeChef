/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			
			//GUTHUB --> NotVenuMadhav
			
			//one way using inbuilt --> nlogn
//			for(int i =0;i<n;i++) {
//				arr[i] = sc.nextInt();
//			}
//			Arrays.sort(arr);
//			for(int i : arr) {
//				System.out.println(i);
//			}
			
			
			
			//bubble sort O(n^2)
			
			/*for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i =0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			for(int i =0;i<n;i++) {
				System.out.println(arr[i]);
			}*/
			
			PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
			
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i =0;i<n;i++) {
				minheap.offer(arr[i]);
			}
			//System.out.println(minheap);
			Iterator it = minheap.iterator();
			
			while (!minheap.isEmpty()) {
			    int i = minheap.poll();
			    System.out.println(i);
			}
			
		}
		catch(Exception e) {
			return;
		}
		
	}
}
