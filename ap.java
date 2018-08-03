import java.util.Scanner;
 class SumofAP {
public static void main(String[] arg)
    {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
   int d=sc.nextInt();
   int n=sc.nextInt();

   int ap=a+(n-1)*d;
   System.out.println(ap);
    }
}
