import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=1;
		for(int i = 0 ;i < n;i++)
        { 
         for(int space=1;space<=(n-i-1);space++)
         {
           System.out.print(" ");
         }
	     for(int j = 0;j<=i;j++)
         {
				System.out.print(k+" ");
                k=k+1;
			}
			System.out.print("\n");			
		}
    }    
}
