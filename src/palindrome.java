import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        //main class
        int m;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        pal(m);
    }
    //to check for palindrome
     public static void pal(int n)
        {
          int sum=0,sum1=0;
            int temp = n;
            while (n > 0) {

                int r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) {

                while (sum > 0) {
                  int  s = sum % 10;
                    if (s % 2 == 0) {
                        sum1 = sum1 + s;
                    }
                    sum = sum / 10;
                }
                if (sum1 > 25)
                    System.out.println(temp + " is palindrome and sum is greater than 25");
                else {
                    System.out.println(temp + " is palindrome and sum is less than 25");
                }
            } else {
                System.out.println("not palindrome");
            }
        }
}
