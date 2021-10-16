package STRING_HANDLING;
//14.Write program to find 2nd location of 0th letter. Input pwerpty output 4.
public class prb14 {
    public static void main(String[] args) {
        String s="pwerpty";
        int str1= s.indexOf("p");
        System.out.println(str1);
String s1 = s.substring(1);
int b = s1.indexOf("p")+1;
        System.out.println(b);
        System.out.println(s1);

    }
}
