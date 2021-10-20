package STRING_HANDLING;
//18. e.g. input patkgfmpkst output kgfm. Input pastgksfsptse output tgks. Input raklfrgmcfd output gmcf. Input ywetyykjhtl output ywet.
import java.util.Scanner;

public class prb18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;

        try {
            System.out.println("Enter string: ");
            a = input.next();

            char zeroth = a.charAt(0);
            String b = a.substring(1);
            int secondZeroth = b.indexOf(zeroth) + 2;

            char x = a.charAt(secondZeroth - 1);
            char y = a.charAt(secondZeroth + 1);

            String temp = a.substring(a.indexOf(y) + 1);

            String finalString = a.substring(a.indexOf(y + 1), temp.indexOf(x) + 1);

            System.out.println("Final string is: " + finalString);
        } catch (Exception e) {
            System.out.println("Error encountered: " + e.getMessage());
        }

        input.close();
    }
}
