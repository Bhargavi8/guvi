/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp,rem,res=0;
      temp=n;
      while(temp!=0)
      {
      	rem=temp%10;
      	res+=Math.pow(rem,3);
      	temp=temp/10;
      }
      if(res==n)
      {
      	System.out.println("yes");
      }
      else
        System.out.println("no");
      
	}
}
