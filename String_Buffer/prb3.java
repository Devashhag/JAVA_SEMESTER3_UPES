package String_Buffer;
//3.Replace second x by y.
public class prb3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("artxuxtxxp");

        int tempIndex = sb.indexOf("x");

        sb.setCharAt(tempIndex,'a');
        int index = sb.indexOf("x");
        sb.setCharAt(index,'y');
        sb.setCharAt(tempIndex,'x');
        System.out.println(sb);

    }
}
