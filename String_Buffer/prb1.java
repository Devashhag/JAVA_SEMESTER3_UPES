package String_Buffer;
//1.Read a string and replace first x by y. Input artxuxtxxp output artyuxtxxp.
public class prb1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("artxuxtxxp");
        int a = sb.indexOf("x");
        sb.setCharAt(a,'y');
        System.out.println(sb);

    }
}
