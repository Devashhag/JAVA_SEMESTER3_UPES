package STRING_HANDLING;



//1.Write program to remove 2nd letter.
// Let the input string is pwsxtpbcderxrtxgt then output is pwxtpbcderxrtxgt.
public class prb1 {
    public static void main(String[] args) {
      String str="pwsxtpbcderxrtxgt";

        System.out.println("the original string is "+str);

       String s= str.substring(0,2)+ str.substring(2+1);
        System.out.println(s);
    }

}
/*  StringBuffer a;
        String b;
        try {
            DataInputStream o=new DataInputStream(System.in);
            a=new StringBuffer("");
            b=o.readLine();
            a.append(b);
            System.out.println("The input string is "+a);
a.deleteCharAt(2);
            System.out.println("the new string now is "+a);
        }catch (Exception e){

        }*/

//System.out.println("new string is "+ Remove(str,2));
/* public static String Remove(String str, int p){
        return str.substring(0,p)+ str.substring(p+1);
    }*/