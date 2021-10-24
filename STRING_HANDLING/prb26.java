package STRING_HANDLING;
// Exchange last letters of first two words. In above case rad Prasam dey.
public class prb26 {
    public static void main(String[] args) {
        String s ="ram Prasad dey";

        int firstspace=s.indexOf(' ');
        String str1=String.valueOf(s.charAt(firstspace-1));

        String str2=s.substring(firstspace+1);
        int secondspace=str2.indexOf(' ')+firstspace+1;
        System.out.println(str1); //m
        System.out.println(secondspace);//10
        System.out.println(str2);//prasad dey

        String str3=String.valueOf(s.charAt(secondspace-1));
        System.out.println(str3); //d


        String finalstring=s.substring(0,firstspace-1)+str3+s.substring(firstspace,secondspace-1)+str1+s.substring(secondspace);
        System.out.println(finalstring);
    }
}
