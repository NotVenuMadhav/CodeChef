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
		try{
		    	Scanner sc= new Scanner(System.in);
        float with = sc.nextFloat();
        float netAmt = sc.nextFloat();
        
        if(with%5 != 0){
            System.out.println(netAmt);
        }
        else if(with > netAmt-0.50f){
            System.out.println(netAmt);
        }else {
            float res = netAmt - with - 0.50f;
            System.out.println(String.format("%.2f",res));
        }
		}catch(Exception e){
		    return;
		}
	
		
		
		
	}
}
