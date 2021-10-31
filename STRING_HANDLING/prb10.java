package STRING_HANDLING;
//10.Write program to find string before 2nd x. In above case pwsxtpbcder.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb10 {
    public static void main(String[] args) {
        String s = "pwsxtpbcderxrtxgt";
        int a = s.indexOf('x');
        String s1=s.substring(0,a)+s.substring(a+1);  // it will make the string and cut down the first x
        int b =s1.indexOf("x"); // now this will check the first x of s1 that is originally the second of x of String s
        String str =s.substring(0,a)+s.substring(a,b+1);
        System.out.println(str); //s4 is the main one here

    }
}
//CODE BY DEVASHISH AGARWAL 500082411