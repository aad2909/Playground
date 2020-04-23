import java.util.Scanner;
class Main
{
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int i,j,k;
      for(i = n ;i>=1;i--)
        {
	     for(j = i;j>=1;j--)
         {
                
				System.out.print(j);
			}
			System.out.print("\n");			
      }
	}
}