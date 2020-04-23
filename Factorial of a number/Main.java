import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int f=1;
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        f=f*i;
      }
      System.out.println(f);
	}
}