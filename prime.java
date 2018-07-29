
class Prime
{
public  static void main(String args[])
{
int n=11;
int i;
boolean flag=true;
for(i=2;i<=n/2;i++)
{
  int temp=n%i;
if(temp==0)
{
flag=false;
break;
}
}
if(flag)
System.out.println("yes");
else
System.out.println("no");
}
}
