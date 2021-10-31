package STRING_HANDLING;
//CODE BY DEVASHISH AGARWAL 500082411

import java.util.Scanner;

//Read two strings. Print lexicographically bigger string first and smaller later.
public class prb19 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     String s1=sc.next();
      String s2= sc.next();
int lexico =s1.compareTo(s2) ; //aa and ab ab >aa

if(lexico>0){
    System.out.println(s1);
    System.out.println(s2);
}

else {
    System.out.println(s2);
    System.out.println(s1);
}


    }
}
//CODE BY DEVASHISH AGARWAL 500082411