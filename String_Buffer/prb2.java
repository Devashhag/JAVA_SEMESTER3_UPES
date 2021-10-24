package String_Buffer;
//2.Replace last x by y. (do not use loop)
public class prb2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("artxuxtxxp");
        sb.reverse(); //first reverse in order to make it as the last x as first x
        int a = sb.indexOf("x");
        sb.setCharAt(a,'y');
        sb.reverse();
        System.out.println(sb);
    }
}
