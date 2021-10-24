package STRING_HANDLING;
//28.Find location of first letter of first word in second word. In above case 5.
public class prb28 {
    public static void main(String[] args) {
        String str ="ram prasad dey";
        int firstspace =str.indexOf(" ");
        System.out.println(firstspace); //index first is 3

        String s=str.substring(0,firstspace); // ram
        System.out.println(s);
      String  str1=str.substring(firstspace+1);
        System.out.println(str1); //prasad dey

        char ch=s.charAt(0);
        int i =str1.indexOf(ch)+s.length()+1; ///srt1.indexofch is 1 r is actually at 1 and add the string length of ram also
        System.out.println("location of first letter in second word is "+i);

    }
}
