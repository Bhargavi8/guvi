import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, min;
        Scanner s = new Scanner(System.in);
        //n = s.nextInt();
        int a[] = new int[10];
        for(int i = 0; i < 10; i++)
        {
            a[i] = s.nextInt();
        }
        min = a[0];
        for(int i = 0; i < 10; i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }
        }
         System.out.println(min);
	}
}
