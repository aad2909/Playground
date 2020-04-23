import java.util.Scanner;
class Main{
    public static int fn(int n1,int n2)
    {
      if(n1>n2)
        return n1;
       else 
         return n2;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int n4=fn(n1,n2);
      if(n4>n3)
        System.out.println(n4);
       else
         System.out.println(n3);
	}
}