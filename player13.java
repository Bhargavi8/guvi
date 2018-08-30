/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int n,m,s,sum=0;
 
            
            Scanner input = new Scanner(System.in);
 
            
             
             n = input.nextInt();
             
          
            while(n>0)
            {
                m=n%10;
                s = m*m;
                
                n=n/10;
                sum=sum+s;
}
                System.out.println(sum);
            

	}
}
