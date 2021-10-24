package STRING_HANDLING;
//3.Write program to exchange first two letters. In above case wpsxtpbcderxrtxgt.
public class prb3 {
    public static void main(String[] args) {
        String s="pwsxtpbcderxrtxgt";
        System.out.println("the original string is "+s);
        String s1=s.substring(1,2)+s.substring(0,1)+s.substring(2);
        System.out.println(s1);

    }

}

