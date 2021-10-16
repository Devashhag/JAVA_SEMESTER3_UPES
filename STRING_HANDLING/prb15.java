package STRING_HANDLING;
//15.Write program, which will delete 1st y immediately after 1st x.
// If input string is pgyeryuyixaysdyexer then output is pgyeryuyixasdyexer.
public class prb15 {
    public static void main(String[] args) {
String s ="pgyeryuyixaysdyexer";
        //String s="abbyuyuyayxaaqyasas"; working for other strings also
        //fine for all strings
int a =s.indexOf("x");
        System.out.println(a);

        String s1= s.substring(a);
        System.out.println(s1);

        int b =s1.indexOf("y");
        System.out.println(b);
        String  c =s1.replaceFirst("y","");
        System.out.println(c);

        String d = s.substring(0,a)+c;
        System.out.println(d);


    }
}

