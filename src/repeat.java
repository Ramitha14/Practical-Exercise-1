
import java.util.Scanner;
public class repeat {
    //main class
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input1=sc.next();
        int input2=sc.nextInt();
        SplitString(input1,input2);
    }
    //to print the cahracters that should repeat
    public static void SplitString(String input1,int input2)
    {
        String reverse="";
        int count=0;
        for (int i = input1.length() - 1; i >= input2; i--) {
            if(count<input2)
            {
                count++;
                reverse = reverse + input1.charAt(i);
            }
        }
        String reverse2="";
        for(int j=reverse.length()-1;j>=0;j--)
        {
            reverse2=reverse2+reverse.charAt(j);
        }
        System.out.print(input1);
        for(int i=0;i<input2;i++)
        {
            System.out.print(reverse2);
        }
    }
}