/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
      
        String s1=sc.next();
          int n=sc.nextInt();
        String s2=s1.substring(0,n);
        System.out.println(s2);
	}
}
