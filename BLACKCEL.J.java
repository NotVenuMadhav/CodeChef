/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main{

	public static void main (String[] args) throws java.lang.Exception
	{

		
			int n;
			int res =0;
			Scanner sc = new Scanner(System.in) ;
			
			try {
				n = sc.nextInt();
				
				if(n>=2 && n<=100) {
					
				
				res = n*(n/2);
				
				
				
				}
				System.out.println(res);
				}catch(Exception e) {
				return;
			}
			
				}
	
	}
