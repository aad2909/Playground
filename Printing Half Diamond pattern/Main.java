import java.util.Scanner;
class Main
{
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int  i, j, space = 1;
       space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
    }
}