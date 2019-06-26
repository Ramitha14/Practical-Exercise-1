import java.util.Scanner;
public class reverse {
    //main class
    public static void main(String[] args)
    {
        String s;
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        Rev(s);
    }
    //to reverse the given string
    public static void Rev(String str)
    {
      String r=" ";
       for(int i=str.length()-1;i>=0;i--)
       {
         r=r+str.charAt(i);
       }
        System.out.println(r);
    }
}
