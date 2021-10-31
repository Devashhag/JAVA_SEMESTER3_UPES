package STRING_HANDLING;
//9.Write program to print the string between 1st and 2nd x. In above case tpbcder.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb9 {
    public static void main(String[] args) {

        String s = "pwsxtpbcderxrtxgt";
        int a = s.indexOf("x");
     //   System.out.println(a);
        String s1=s.substring(0,a)+s.substring(a+1);  // it will make the string and cut down the first x
        int b =s1.indexOf("x"); // now this will check the first x of s1 that is originally the second of x of String s
       // System.out.println(b);
        //System.out.println(s1);
String s3=s.substring(a+1,b+1); //a+1 is after the first x and b+1 is before the second x
        System.out.println(s3); //this is the final product that we want to get


    }
}
//CODE BY DEVASHISH AGARWAL 500082411