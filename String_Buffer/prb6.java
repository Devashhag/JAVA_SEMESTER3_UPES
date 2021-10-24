package String_Buffer;

import java.util.Scanner;
//check palindrome
public class prb6 {
    public static void main(String[] args) {
        String str;
        Scanner sc= new Scanner(System.in);
        str=sc.next();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String str2 = sb.toString();

        if(str.equals(str2)){
            System.out.println("its palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
