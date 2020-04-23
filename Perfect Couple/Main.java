import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int i,j,k;
      k=(n/2)+1;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      int no=in.nextInt();
      for(i=0;i<k;i++)
      {
        for(j=0;j<n;j++)
        {
          if((a[i]+a[j])==no)
            System.out.println(a[i]+", "+a[j]);
        }
      }
    }
}