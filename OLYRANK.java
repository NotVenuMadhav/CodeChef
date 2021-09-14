/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	
	public static void printt(int [] arr) {
		
		
			
			if(arr[0]+arr[1]+arr[2] > arr[3]+arr[4]+arr[5]) {
				
				System.out.println(""+1);
			}
			else {
				System.out.println(""+2);
			}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{

		
			int T;
			Scanner sc = new Scanner(System.in) ;
			
			try {
				T = sc.nextInt();
				int [] arr = new int[6];
				
				
				
				while(T>=1 && T<=1000) {
				for( int i =0 ; i< T; i++) {
					
					
					
					for(int j =0; j< 6; j++) {
						
						arr[j] = sc.nextInt();
						
					}
					
					printt(arr);
					
				}
				
			}}catch(Exception e) {
				return;
			}
			
				}
	
	}
