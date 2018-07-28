import java.util.*;
class Prime
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
boolean flag=false;
for(i=2;i<=n/2;i++)
{
if(n%1==0)
{
flag=true;
break;
}
}
if(flag==false)
System.out.println("yes");
else
System.out.println("no");
}
}
