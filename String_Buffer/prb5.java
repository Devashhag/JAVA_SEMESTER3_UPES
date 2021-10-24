package String_Buffer;
//5.Find the number of x’s. In above case 4.
public class prb5 {
    public static void main(String[] args) {
       StringBuffer sb= new StringBuffer("artxuxtxxp") ;
       int a=0;
       char ch;
       for (int i =0;i<sb.length();i++){
           ch=sb.charAt(i);
           if(ch=='x'){
               a=a+1;
           }
       }
        System.out.println("x appeared "+a+" times");
    }
}
