package String_Buffer;
//2.Replace last x by y. (do not use loop)
public class prb2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("artxuxtxxp");
        sb.reverse();

        int index = sb.indexOf("x");
        sb.setCharAt(index,'y');
        sb.reverse();
        System.out.println(sb);
    }
}
