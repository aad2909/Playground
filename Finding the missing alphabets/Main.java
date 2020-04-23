import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder sb=new StringBuilder(s);
      int a[]=new int[26];
      int offset;
      int l=sb.length();
      int i;
      for(i=0;i<l;i++)
      {
        if(s.charAt(i)==' ')
          continue;
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
        {
          offset=sb.charAt(i)-'a';
         a[offset]++;
        }
        else if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
        {
          offset=sb.charAt(i)-'A';
          a[offset]++;
        }
      }
      for(i=0;i<26;i++)
      {
        if(a[i]==0)
        {
          int c='a'+i;
          char ch=(char) c;
        System.out.print(ch+" ");
        }
      }
    }
}