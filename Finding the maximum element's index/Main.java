import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int i,max,pos=0;
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    max=a[0];
    for(i=1;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        pos=i;
    }
  }
    System.out.println(pos);
}
}