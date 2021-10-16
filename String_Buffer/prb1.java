package String_Buffer;
//1.Read a string and replace first x by y. Input artxuxtxxp output artyuxtxxp.
public class prb1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("artxuxtxxp");
        int index = sb.indexOf("x");
        sb.setCharAt(index,'y');
        System.out.println(sb);

    }
}
