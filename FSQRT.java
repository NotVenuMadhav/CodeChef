/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{

	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			int n;
			for(int i=0;i<t;i++) {
				
				n = sc.nextInt();
				
				double sq = Math.sqrt(n);
				System.out.println((int)sq);
				
			}
			
		}
		catch(Exception e) {
			return;
		}
		
	}
}
