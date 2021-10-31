package STRING_HANDLING;
//12.Program to exchange the string between 1st and 2nd x, with the string before 1st x. In above case tpbcderxpwsxrtxgt

//CODE BY DEVASHISH AGARWAL 500082411
public class prb12 {
    public static void main(String[] args) {

        String s = "pwsxtpbcderxrtxgt";
        int a = s.indexOf('x');
       String s1=s.substring(0,a)+s.substring(a+1);  // it will make the string and cut down the first x
        int b =s1.indexOf("x"); // now this will check the first x of s1 that is originally the second of x of String s
     //    System.out.println(b);
       String str =s.substring(0,a); /// imp this is before  the first x string
        System.out.println(str);
        String str1=s.substring(a+1,b+1); // this is after the first x till before the second x
        System.out.println(str1);
        String finalstring=str1+"x"+str+s.substring(b+1); // merge the before and after x
        System.out.println(finalstring);


//CODE BY DEVASHISH AGARWAL 500082411
    }
}
