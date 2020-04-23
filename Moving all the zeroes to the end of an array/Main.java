import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int c[]=new int[n];
      int d=0,i;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]!=0)
        {
          b[d]=a[i];
          d=d+1;
        }
      }
      for(i=0;i<n;i++)
      {
        System.out.print(b[i]);
        System.out.print(" ");
      }
    }
}