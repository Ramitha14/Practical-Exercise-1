import java.util.Scanner;
public class character{
    //main class
    public static void main(String[] args) {
        char c;
        System.out.println("enter the character:");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        findcharacter(c);
    }
    //to check for upper,lower,digit,spcl characters
public static void findcharacter(char ch)
{
    if((ch>=65)&&(ch<=90))
    {
        System.out.println("Upper case");
    }
    else if((ch>=97)&&(ch<=122))
    {
        System.out.println("Lower case");
    }
    else if((ch>=48)&&(ch<=57))

    {
        System.out.println("Digit");
    }
    else if((ch>=58)&&(ch<65)||(ch>=91)&&(ch<97)||(ch>=1)&&(ch<=47)||(ch>=123)&&(ch<=127))
    {
        System.out.println("Special character");
    }



}


}