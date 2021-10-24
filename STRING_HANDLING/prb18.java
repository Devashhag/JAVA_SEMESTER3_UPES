package STRING_HANDLING;
//18. e.g. input patkgfmpkst output kgfm. Input pastgksfsptse output tgks. Input raklfrgmcfd output gmcf. Input ywetyykjhtl output ywet.
import java.util.Scanner;

public class prb18 {
    public static void main(String[] args) {
        System.out.println("enter the string"); //if input is patkgfmpkst

        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        char b = a.charAt(0);

        String c = a.substring(1);

        char d = c.charAt(c.indexOf(b)-1);
      //  System.out.println(d); //m

        char e = c.charAt(c.indexOf(b)+1);
        //System.out.println(e);//k

        String f = a.substring(a.indexOf(e));
        //System.out.println(f);//kgfmpkst
        System.out.println("final string is");
        System.out.println(f.substring(0,f.indexOf(d)+1)); //kgfm
    }
}
