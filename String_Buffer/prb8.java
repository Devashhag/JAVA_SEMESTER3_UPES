package String_Buffer;
//8.Suppose string has words. e.g. Ram is a good boy. Find first and second word.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb8 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Ram is a good boy");
       int firstspace=sb.indexOf(" ");
        System.out.println(firstspace); //3 pe space aaya
        String str=sb.substring(0,firstspace);
        System.out.println(str); // print ram

        String str1=sb.substring(firstspace+1);
        System.out.println(str1); // is a good boy
        int secondspace=str1.indexOf(" ");
        System.out.println(secondspace);
        String str2=str1.substring(0,secondspace);
        System.out.println(str2); // print is

        System.out.println("first word is "+str);
        System.out.println("second word is "+str2);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411