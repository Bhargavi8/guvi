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
      if(isPowerOfTwo(n))
      {
       System.out.println("yes");
      }
      else
       System.out.println("no"); 		
	}
private static boolean isPowerOfTwo(int n) {

    if (n % 2 != 0) {
      return false;
    } else {

      for (int i = 0; i <= n; i++) {

        if (Math.pow(2, i) == n) return true;
      }
    }
    return false;
  }
}
