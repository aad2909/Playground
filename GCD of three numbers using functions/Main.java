import java.util.Scanner;
public class Main{
    public static int gcd(int n1,int n2)
    {
      int i,min;
      if(n1>n2)
        min=n2;
      else
        min=n1;
     for(i=min;i>=1;i--)
     {
       if(n1%min==0&&n2%min==0)
         break;
       else
         min=min-1;
    }
      return min;
    }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n4,n5;
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      n4=gcd(n1,n2);
      n5=gcd(n3,n4);
      System.out.println(n5);
    }
}