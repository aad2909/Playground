import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fd=n;
      while(fd>=100)
      {
        fd=fd/10;
      }
      int sum=fd%10;
      System.out.println(sum);
	}
}