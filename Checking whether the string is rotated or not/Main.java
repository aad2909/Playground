import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      String s3,s4;
      int i,p=0;
      s3=s1.concat(s1);
      int l1=s3.length();
      int l2=s2.length();
      for(i=0;i<(l1/2);i++)
      {
        s4=s3.substring(i,l2+i);
        if(s4.equals(s2))
        {
          p=1;
          break;
        }
      }
      if(p==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}