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
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        int H=sc.nextInt();
        int SA = 2*((L*B) + (B*H) + (L*H));
        int V=L*B*H;
        System.out.print(SA+" "+V);
       
   

	}
}
