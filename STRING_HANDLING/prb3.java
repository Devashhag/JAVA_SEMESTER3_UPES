package STRING_HANDLING;
//3.Write program to exchange first two letters. In above case wpsxtpbcderxrtxgt.
public class prb3 {
    public static void main(String[] args) {
        String s="pwsxtpbcderxrtxgt";
        System.out.println("the original string is "+s);
        System.out.println(Exchange(s));
    }
    public static String Exchange(String s){

        return s.substring(1,2)+s.substring(0,1)+s.substring(2);

    }
}