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
        float celsius=sc.nextFloat();
        float kelvin = celsius + 273.15F;
        int kel=(int) kelvin;
		System.out.println(kel);
	}
}
