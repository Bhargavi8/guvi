import java.util.*;
class Prime
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int q=sc.nextInt();
while(n<q)
{
boolean flag=true;
for(int i=2;i<=n/2;i++)
{
  int temp=n%i;
if(temp==0)
{
flag=false;
break;
}
}
if(n==1)
{
flag=false;
}
if(flag)
System.out.println(n+ " ");
++n;
}
}
}
