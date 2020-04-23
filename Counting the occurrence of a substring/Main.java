import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String sdd;
    StringBuilder sb=new StringBuilder(s);
    String f=in.nextLine();
    StringBuilder fd=new StringBuilder(f);
    int l=sb.length();
    int l1=fd.length();
    int i,c=0;
    int l2;
    l2=l-l1+1;
    for(i=0;i<l2;i++)
    {
      sdd=sb.substring(i,i+l1);
      if(f.equals(sdd))
        c=c+1;
    }
    System.out.print(c);
  } 
}
