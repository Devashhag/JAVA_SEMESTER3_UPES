package STRING_HANDLING;
//13.Write program to exchange neighbors of first x. In above case pwtxspbcderxrtxgt.
public class prb13 {
    public static void main(String[] args) {

        String s = "pwsxtpbcderxrtxgt";

        int a = s.indexOf('x');
        String s1=s.substring(0,a)+s.substring(a+1);  // it will make the string and cut down the first x
        int b =s1.indexOf("x"); // now this will check the first x of s1 that is originally the second of x of String s
        //    System.out.println(b);
        String str =s.substring(0,a-1); ///  pw
        System.out.println(str);
        String str1=s.substring(a+2); // pbcderxrtxgt
        System.out.println(str1);
      String s3=s.substring(2,3); //s location
      String s4=s.substring(4,5); // t location

        String main =str+s4+"x"+s3+str1;
        System.out.println(main);


    }
}


