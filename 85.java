import java.util.*;
class Ideone1 {

	public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
     char ch[]=s.toCharArray();
     String s1="";
    String s2="";
    for(int i=0;i<ch.length;i++)
{
	if(i%2==0) {
		s1+=ch[i];
	}
	else
	{
		s2+=ch[i];
	}
}
	System.out.print(s1+" "+s2);
	}

}
