package STRING_HANDLING;

import java.io.DataInputStream;

//2.Write program to add 0th letter in the beginning. In above case ppwsxtpbcderxrtxgt
//CODE BY DEVASHISH AGARWAL 500082411
public class prb2 {
    public static void main(String[] args) {
        String str="pwsxtpbcderxrtxgt";
        System.out.println("the original string is "+str);

        String s=str.substring(0,1)+str;
        System.out.println(s);

    }

}//CODE BY DEVASHISH AGARWAL 500082411



