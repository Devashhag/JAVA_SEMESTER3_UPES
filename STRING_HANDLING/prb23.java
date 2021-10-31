package STRING_HANDLING;
//23.Delete second word. In above case ram dey.
//CODE BY DEVASHISH AGARWAL 500082411
public class prb23 {
    public static void main(String[] args) {
        String s ="ram Prasad dey";
        System.out.println(s.trim());

        int firstspace=s.indexOf(' ');
        System.out.println(firstspace); //3

        String str=s.substring(firstspace+1);

        int secondspace=str.indexOf(' ');
        System.out.println(secondspace);//6

        String finalstring =s.substring(0,firstspace)+str.substring(secondspace);
        System.out.println(finalstring); //ram dey
    }
}
//CODE BY DEVASHISH AGARWAL 500082411