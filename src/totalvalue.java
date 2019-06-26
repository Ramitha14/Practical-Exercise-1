import java.util.Scanner;

public class totalvalue {
    //main class
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int array[]={10,15,20,25};
        //to sum all the given numbers
        for(int a:array)
        {
           sum=sum+a;

        }
        System.out.println("The sum is "+sum);
    }
    }

