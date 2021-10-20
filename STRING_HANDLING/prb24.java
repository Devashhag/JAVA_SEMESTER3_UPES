package STRING_HANDLING;
//24.Exchange first and second word. In above case Prasad ram dey.
public class prb24 {
    public static void main(String[] args) {
        String s ="ram Prasad dey";
      //  System.out.println(s.trim());
        int firstspace=s.indexOf(' ');
        String str1=s.substring(0,firstspace);
        System.out.println(str1); //ram

        String str2=s.substring(firstspace+1);
        System.out.println(str2); //prasad dey

        int secondspace=str2.indexOf(' ');

        String str3=str2.substring(0,secondspace);
        System.out.println(str3);//prasad

        String finalstring =str3 + " "+str1+str2.substring(secondspace);
        System.out.println(finalstring);



    }
}
