/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int i,flag=0;
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
         int k=sc.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == k)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag==1)
        {
         System.out.println("yes");
        }
        else
         System.out.println("no");         
	}
}
