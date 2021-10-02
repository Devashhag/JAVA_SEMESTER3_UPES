package STRING_HANDLING;

import java.io.DataInputStream;

//2.Write program to add 0th letter in the beginning. In above case ppwsxtpbcderxrtxgt
public class prb2 {
    public static void main(String[] args) {
        String str="pwsxtpbcderxrtxgt";
        System.out.println("the original string is "+str);
        System.out.println("new string is "+Add(str));


    }
    public static String Add(String str){
        return  str.substring(0,1)+str;
    }
}
