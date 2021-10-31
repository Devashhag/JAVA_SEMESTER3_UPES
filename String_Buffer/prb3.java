package String_Buffer;
//3.Replace second x by y.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("artxuxtxxp");
        int a1=sb.indexOf("x"); //tells the index of first x
        //System.out.println(a1);

        sb.setCharAt(a1,'a');  //well replace first x by a
        //System.out.println(sb);

        int b=sb.indexOf("x"); // now well check the index of x
//        System.out.println(b);

sb.setCharAt(b,'y'); //well replace now
  //      System.out.println(sb);

        sb.setCharAt(a1,'x'); //undo the process
        System.out.println(sb);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411