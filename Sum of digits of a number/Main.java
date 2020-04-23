import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int fd=n;
      while(fd>=10)
      {
        sum=sum+(fd%10);
        fd=fd/10;
      }
      sum=sum+fd;
      System.out.println(sum);
	}
}