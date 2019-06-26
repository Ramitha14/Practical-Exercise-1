
import  java.util.Scanner;

public class oddoreven {
    //main class
    public static void main(String args[]) {
        int n, r;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = findoddoreven(n);
        if (r == 1) {
            System.out.println("Jerry");
        } else {
            System.out.println("Tom");
        }
    }
//to check odd or even
    public static int findoddoreven(int res) {
        if ((res % 2 == 0) && ((res >=20) && (res <= 30))) {
            return 1;
        } else {
            return 0;
        }

    }
}
