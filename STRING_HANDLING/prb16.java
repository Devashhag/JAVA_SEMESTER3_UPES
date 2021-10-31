package STRING_HANDLING;
//16.Write program to exchange neighbors of first occurrence of left neighbors of first ‘x’.
// e.g. input abcdefxgh output abcdxfegh.
// input abfcdefxgh output acfbdefxgh.
//CODE BY DEVASHISH AGARWAL 500082411
import java.util.Scanner;

public class prb16 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       int x1=a.indexOf('x');
        //System.out.println(x1);
       char leftof_x1=a.charAt(x1-1);
       String b=String.valueOf(leftof_x1); // shows us the left occourence of first x
        System.out.println("the first x left character is "+b);

        int firstoccleftx =a.indexOf(leftof_x1);
        String left =a.substring(firstoccleftx-1,firstoccleftx); // ;left occourence of left neighbour of x
        System.out.println("the left character of first occourence of left of x is "+left);
String right=a.substring(firstoccleftx+1,firstoccleftx+2); //right occourence of right neighbour of x
        System.out.println("the right character of first occourence of left of x is "+right);

        String c=a.substring(0,a.indexOf(left))+right+b+left+a.substring(a.indexOf(right)+1);
        System.out.println("The final string is "+c);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411