package STRING_HANDLING;
//27.Find the location of first ‘a’ in second word. In above case 6.
public class prb27 {
    public static void main(String[] args) {
        String s ="ram Prasad dey";
        int a=s.indexOf('a');
        String s1=s.substring(0,a)+s.substring(a+1);
     //   System.out.println(s1);
     int b=s1.indexOf('a')+1;
        System.out.println("the location of first a in second word is "+b);

    }
}
