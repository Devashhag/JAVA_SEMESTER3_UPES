package STRING_HANDLING;
//25.Exchange first letters of first two words. In above case Pam rrasad dey.
public class prb25 {
    public static void main(String[] args) {
        String s ="ram Prasad dey";
        String str =s.valueOf(s.charAt(0));
        System.out.println(str); //r

        int firstspace=s.indexOf(' ');

        String str2=String.valueOf(s.charAt(firstspace+1));
        System.out.println(str2);//p

        String finalstr=str2+s.substring(1,firstspace+1)+str+s.substring(firstspace+2);
        System.out.println(finalstr);
    }
}
