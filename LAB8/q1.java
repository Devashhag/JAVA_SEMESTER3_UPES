//Write a program for searching strings for the first occurrence of a character
// or substring and for the last occurrence of a character or substring.

package LAB8;

public class q1 {
    public static void main(String[] args) {
       String s ="hello my name is devashish agarwal";
        int s1=s.indexOf("de");
        int s2=s.lastIndexOf('m');
        System.out.println("the first occourence is "+s1);
        System.out.println("the last occourence is "+s2);


    }
}
