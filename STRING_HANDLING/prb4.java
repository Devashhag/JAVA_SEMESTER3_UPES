package STRING_HANDLING;
//4.Write program to exchange 4th and 10th letter. In above case pwsxrpbcdetxrtxgt.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb4 {
    public static void main(String[] args) { //abcdefghijklmnop
        String s="pwsxtpbcderxrtxgt";
        System.out.println("the original string is "+s);
String s1= s.substring(0,4)+s.substring(10,11)+s.substring(5,10)+s.substring(4,5)+s.substring(10);
        System.out.println(s1);

    }

    }
//CODE BY DEVASHISH AGARWAL 500082411