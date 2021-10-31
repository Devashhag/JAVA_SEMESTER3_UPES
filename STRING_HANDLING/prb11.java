package STRING_HANDLING;
//11.Write program to delete the string between 1st and 2nd x. In above case pwsxxrtxgt.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb11 {
    public static void main(String[] args) {
        String s = "pwsxtpbcderxrtxgt";
        int a = s.indexOf('x');
        String s1=s.substring(0,a)+s.substring(a+1);  // it will make the string and cut down the first x
        int b =s1.indexOf("x"); // now this will check the first x of s1 that is originally the second of x of String s
        // System.out.println(b);
        //System.out.println(s1);
      //  String s3=s.substring(a+1,b+1); //a+1 is after the first x and b+1 is before the second x
       // System.out.println(s3); //this is the final product that we want to get
        //String s4 =s.substring(0,a)+s.substring(a,b+1);
       // System.out.println(s4); //s4 is the main one here
String str= s.substring(0,a+1)+s.substring(b+1);
        System.out.println(str);

    }
}//CODE BY DEVASHISH AGARWAL 500082411
//OTHER METHOD LOGIC-->
/*
        String str = s1.substring(0, a) + s1.substring(a + 1);
//from p to s and then from t to last
        //also this is used for removal of first x so that next string used up as first one
       // System.out.println(str);
        int b = str.indexOf('x') + 1;
        String str2 = s1.substring(0, a + 1) + s1.substring(b);
          System.out.println(str2);
*/