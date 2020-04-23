import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int n1,n3,f=1,sn=0;
      n1=n;
      while(n1>0)
      {
        f=1;
        n3=n1%10;
          for(int i=1;i<=n3;i++)
          {
            f=f*i;
          }
        sn=sn+f;
       n1=n1/10;
      } 
      if(sn==n)
      System.out.println("Yes");
      else
      System.out.println("No");
	}
}