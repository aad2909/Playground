import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int n1,n3,an=0;
      double f=1.0;
      n1=n;
      int n2=n;
      int p;
      for(p=0;n2>=10;p++)
      {
        n2=n2/10;
      }
      p=p+1;
      while(n1>0)
      {
        f=1.0;
        n3=n1%10;
        f=Math.pow(n3,p);
        an=an+(int)f;
       n1=n1/10;
      } 
      if(an==n)
      System.out.println("Armstrong Number");
      else
      System.out.println("Not a Armstrong Number");
	}
}