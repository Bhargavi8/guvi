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
	int i,count=0;
	String s="";
	s+=sc.nextLine();
int l=s.length();
for(i=0;i<l;i++)
{
	 if(s.charAt(i)>='0'&&s.charAt(i)<='9')
	{
	    count++;
	}
}
	
	System.out.print(count);
	
	}
}
