import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int loc1=-1,loc2=-1,i;
       a[0]=in.nextInt();
       a[1]=in.nextInt();
      a[2]=in.nextInt();
      a[3]=in.nextInt();
      a[4]=in.nextInt();
      int n1=in.nextInt();
      int n2=in.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]==n1)
          loc1=i;
        if(a[i]==n2)
          loc2=i;
      }
      System.out.println(loc1);
      System.out.println(loc2);
    }
}