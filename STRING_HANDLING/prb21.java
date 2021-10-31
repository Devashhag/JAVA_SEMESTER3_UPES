package STRING_HANDLING;

import java.util.Scanner;

//21.Read three strings. Print 1 if first string is biggest, 2 if second string is biggest,
// 3 if 3rd string is biggest, 0 if all are same, -1 if 1st and 2nd string are biggest,
// -2 if 2nd and 3rd string are biggest, -3 if 1st and 3rd string are biggest.

//CODE BY DEVASHISH AGARWAL 500082411
public class prb21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, c;

        System.out.println("Enter three strings:");

        a = input.next();
        b = input.next();
        c = input.next();

        if(a.length()>b.length() && a.length()>c.length()){
            System.out.println(1);
        }
        else if(b.length()>a.length() && b.length()> c.length()){
            System.out.println(2);
        }
        else if(c.length()>a.length() && c.length()>b.length()){
            System.out.println(3);
        }
        else if(a.length()==b.length() && b.length()==c.length() ){
            System.out.println(0);
        }
        else if(a.length()==b.length() && c.length()<a.length()){
            System.out.println(-1);
        }
        else if(b.length()==c.length() &&a.length()<c.length()){
            System.out.println(-2);
        }
        else
        {
            System.out.println(-3);
        }

    }

}
//CODE BY DEVASHISH AGARWAL 500082411

