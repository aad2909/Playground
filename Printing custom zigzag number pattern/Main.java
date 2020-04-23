import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=2;
for(int i=1;i<=n;i++)
   {
       if(i%2==0)
       System.out.print(c++);
       for(int j=1;j<n;j++)
       {
           System.out.print(i);
       }
       if(i%2!=0)
       System.out.print(c++);
       System.out.println();
   }
	}
}
