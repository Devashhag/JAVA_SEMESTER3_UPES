package STRING_HANDLING;

import java.util.Scanner;

//20.Read two string. Print 1 if first string is bigger, 2 if second string is bigger, 0 if both are same.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2= sc.next();
        if(s1.length()>s2.length()){
            System.out.println(1);//s1 is bigger than s2
        }
        else if(s1.length()<s2.length()){
            System.out.println(2);//2nd one is bigger
        }
        else if(s1.length()==s2.length()){
            System.out.println(0); // both are same
        }
else{
            System.out.println("error occoured");
        }
    }
}
//CODE BY DEVASHISH AGARWAL 500082411