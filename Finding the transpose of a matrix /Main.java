import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int i,j;
    int m1[][]=new int[r][c];
    int m2[][]=new int[r][c];  
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        m1[i][j]=in.nextInt();
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        m2[j][i]=m1[i][j];
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        System.out.print(m2[i][j]+" ");
      System.out.println();
  }
}
}