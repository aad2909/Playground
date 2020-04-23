import java.util.Scanner;
class Main
{
  public static void fn(int b[],int n1)
  {
    int sum=1,c=1,j=1;
    for(int i=0;i<n1;i++)
    {
      sum=sum+b[i];
      if(j%3==0)
      {
        if(sum!=n1)
        {
          c=0;
          break;
        }
        sum=1;
      }
      j=j+1;
    }
    if(c==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    fn(a,n);
  }
}