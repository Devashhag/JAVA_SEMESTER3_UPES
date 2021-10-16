package STRING_HANDLING;

//8.Write program to output the location of second x. In above case 11.

public class prb8 {
    public static void main(String[] args) {
        String s1="pwsxtpbcderxrtxgt";
        int a = s1.indexOf('x');
       // System.out.println(a);   //returns 3
String s2 = s1.substring(0,a)+s1.substring(a+1);
      //  System.out.println(s2);  //returns pwstpbcderxrtxgt
        int b =s2.indexOf("x")+1;//+1 here cz we have deleted the first x so we have to add it

        System.out.println(" the output of second x is "+b);
    }

}
