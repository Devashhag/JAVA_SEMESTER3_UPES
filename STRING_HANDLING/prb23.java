package STRING_HANDLING;
//23.Delete second word. In above case ram dey.
public class prb23 {
    public static void main(String[] args) {
        String s ="ram Prasad dey";
        System.out.println(s.trim());

        int firstspace=s.indexOf(' ');
        System.out.println(firstspace);

        String str=s.substring(firstspace+1);

        int secondspace=str.indexOf(' ');
        System.out.println(secondspace);

        String finalstring =s.substring(0,firstspace)+str.substring(secondspace);
        System.out.println(finalstring);
    }
}
