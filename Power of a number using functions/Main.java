import java.util.Scanner;
class Main{
    public static int ex(int b,int e)
    {
      double exp=Math.pow(b,e);
      int i;
      i=(int)exp;
      return i;
    }
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int ep=ex(n1,n2);
      System.out.println(ep);
    }
}