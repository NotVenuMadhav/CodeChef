import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static int fact(int num) {
		
		int fact=1;
		if(num<=1) {
			return 1;
		}
		
		for(int i=2;i<=num;i++) {
			fact = fact*i;
		}
		
		return fact;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			
			for(int i=0;i<t;i++) {
				
				int n = sc.nextInt();
				System.out.println(""+fact(n));
				
			}
			
		}catch(Exception e) {
			return;
		}
		
	}
}
