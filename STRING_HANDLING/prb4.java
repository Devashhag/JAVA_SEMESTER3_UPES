package STRING_HANDLING;
//4.Write program to exchange 4th and 10th letter. In above case pwsxrpbcdetxrtxgt.
public class prb4 {
    public static void main(String[] args) { //abcdefghijklmnop
        String s="pwsxtpbcderxrtxgt";
        System.out.println("the original string is "+s);

        System.out.println("the new string is "+Exchange(s));
    }
    public static String Exchange(String s) {
        return s.substring(0,4)+s.substring(10,11)+s.substring(5,10)+s.substring(4,5)+s.substring(10);

    }
    }