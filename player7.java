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
String s;
       char t;
       Scanner ss=new Scanner(System.in);
       s=ss.next();
       char a[]=s.toCharArray();
       for(int i=0;i<s.length();i+=2){
           t=a[i];
           a[i]=a[i+1];
           a[i+1]=t;

       }
      for(int i=0;i<s.length();i++){
          System.out.print(a[i]);
      }

	}
}
