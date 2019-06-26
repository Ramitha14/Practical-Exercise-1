import java.util.Scanner;
public class voworcon {
    //main class
    public static void main(String[] args) {
        String s;

        int i;
        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        for(i=0;i<s.length();i++) {
            char r = s.charAt(0);

            vowelconsonent(r);
        }
    }
    //to check whether it is vowel or consonent
    public static void vowelconsonent(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " - Vowel");
        } else if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z'))
            System.out.println(ch + " - Consonant");

        else {
            System.out.println("Error-Enter correct character");
        }
    }

}