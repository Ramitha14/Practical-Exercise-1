import java.util.Scanner;
public class loop {
    //main class
    public static void main(String[] args)
    {
    int n;
    System.out.println("enter the value of n:");
    Scanner sc=new Scanner(System.in);
    n = sc.nextInt();
    iteration(n);
   }
   //loop for iteration of numbers
public static void iteration(int num)
{
    int i,j;
  for(i=1;i<=num;i++)
  {
      for(j=1;j<=i;j++)
      {
          System.out.println(i);
      }
  }

}
}
