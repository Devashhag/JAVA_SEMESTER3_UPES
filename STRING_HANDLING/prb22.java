package STRING_HANDLING;
//22.Print second word. In above case Prasad.
public class prb22 {
    public static void main(String[] args) {
        String s ="ram Prasad dey";
        System.out.println(s.trim());
        int firstspace=s.indexOf(' ');
        System.out.println(firstspace); //3
        String str=s.substring(firstspace+1);

        int secondspace=str.indexOf(' ');
        System.out.println(secondspace); //6

        String finalstring=str.substring(0,secondspace);
        System.out.println(finalstring);//prasad
    }
}
