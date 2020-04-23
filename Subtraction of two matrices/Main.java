import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int i,j;
    int m1[][]=new int[r][c];
    int m2[][]=new int[r][c];  
    int m3[][]=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        m1[i][j]=in.nextInt();
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        m2[i][j]=in.nextInt();
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        m3[i][j]=m1[i][j]-m2[i][j];
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        System.out.print(m3[i][j]+" ");
      System.out.println();
    }
  }
}