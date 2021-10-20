package STRING_HANDLING;

import java.util.Scanner;

//17.Write program to replace first occurrence of right neighbor of 2nd x by left
// neighbor of 1st x. Input imgpxugxutkl output imgpxpgxutkl. Input bcxdefxgh output bcxdefxch.
public class prb17 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String a;
        try {
            System.out.println("Enter string: ");
            a = input.next();

            int firstX = a.indexOf('x');

            String newString = a.substring(firstX + 1);

            int secondX = newString.indexOf('x') + 1;

            char rightNSX = a.charAt(secondX + 1);

            int firstOccRNSX = a.indexOf(rightNSX);

            String LNFX = String.valueOf(a.charAt(firstX - 1));

            String finalString = a.substring(0, firstOccRNSX + 1) + LNFX + a.substring(firstOccRNSX + 2);

            System.out.println("Final string is: " + finalString);
        } catch (Exception e) {
            System.out.println("Error encountered: " + e.getMessage());
        }

        input.close();

    }
}
/*




////
 /*Scanner sc = new Scanner(System.in);
      String a;
      a=sc.next(); //if input is imgpxugxutkl
      int firstx=a.indexOf("x");
      String b=a.substring(firstx+1);//ugxutkl
        System.out.println(b);
        int secondx=b.indexOf('x')+1;
        System.out.println(secondx);
        char a1=a.charAt(secondx+1); //x of second one
        System.out.println(a1);
        int first_occ=a.indexOf(a1); //4 will print
        System.out.println(first_occ);
        String c=String.valueOf(a.charAt(firstx-1)); // will print p
        System.out.println(c);
        String finalStr=a.substring(0,first_occ+1)+c+a.substring(first_occ+2);
        System.out.println(finalStr);*/