package STRING_HANDLING;
//7.Write program to replace first x by y. In above case pwsytpbcderxrtxgt.
public class prb7 {
    public static void main(String[] args) {
        String s1="pwsxtpbcderxrtxgt";
        //we are using replace first in order to replace first x by y
        String str=s1.replaceFirst("x","y");
        System.out.println(str);

    }
}
