import java.util.Scanner;
public class randomnumber {
    public static void main(String[] args)
  //main class
    {
        int x;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        check(x);

    }
    //to check whether original number matches with the random number
    public static void check(int random)
    {
        int originalnumber=30;
        if(originalnumber>random)
        {
            System.out.println("The number guessed is less than the original number");
        }
        else if(originalnumber<random)
        {
            System.out.println("The number guessed is greater than the original number");
        }
        else if(originalnumber==random)
        {
            System.out.println("The number guessed matches the original number");
        }

    }
}
