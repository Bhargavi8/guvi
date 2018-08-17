import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GFG
{
	static float SumOfAP(float A,float B,int C)
	{

		float sum=0;
		for(int i= 0;i < C;i++)
		{
			sum=sum+A;
			A=A+B;
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
		int C=sc.nextInt();;
		float A=sc.nextFloat();
        float B=sc.nextFloat();;
	     int ap=(int) SumOfAP(A,B,C);
        System.out.println(ap);
       
        }
	}
