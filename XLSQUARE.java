/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int T;
		int N;
		int A;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
	
	int	res =0;
		for(int i =0; i<T;i++){
		    
		    	N = sc.nextInt();
	        	A = sc.nextInt(); 
		    res = ((int)Math.sqrt(N))*A;
		    System.out.println(res);
		}
	}
}
