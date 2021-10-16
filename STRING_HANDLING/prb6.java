package STRING_HANDLING;
//6.Write a program, which reads a string and finds string after the first x.
// Let the input string is pwsxtpbcderxrtxgt then output is tpbcderxrtxgt.
public class prb6 {
    public static void main(String[] args) {

        String s="pwsxtpbcderxrtxgt";
      int a =s.indexOf("x"); //we cant use string so we have to use int to get the loc of x
      //The indexOf() method is used in Java to retrieve
        // the index position at which a particular character or substring appears in another string.
      //  System.out.println(a);  shows u the index
        System.out.println(s.indexOf("x"));
       String s1=s.substring(a+1);
       //this will do one work it will starts from x and goes till end
        System.out.println(s1);

    }
}

