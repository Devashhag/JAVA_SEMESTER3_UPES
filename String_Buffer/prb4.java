package String_Buffer;
//4.Replace all x’s by y.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb4 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("artxuxtxxp");
 String str=  sb.toString().replaceAll("x","y");//converted sb to string and then replacing at same time
        System.out.println(str);

    }
}
//CODE BY DEVASHISH AGARWAL 500082411