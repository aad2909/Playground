import java.util.Scanner;
class Main{
    public static void prime(int n)
    {
      int i,j,fac=0;
      for(i=2;i<=n;i++)
      {
        fac=0;
        for(j=1;j<=i;j++)
        {
          if(i%j==0)
            fac=fac+1;
        }
        if(fac==2)
          System.out.println(i);
      }
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
}