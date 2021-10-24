package String_Buffer;
//7.Find length of the string. (Do not use length( ))
public class prb7 {
    public static void main(String[] args) {
StringBuffer sb= new StringBuffer("javastrings");
        //System.out.println("this is a string");
        try{
        for (int i=0;;i++){
            sb.charAt(i);
            System.out.println("length of string  "+sb+" is "+(i));
        }}catch (Exception e){

        }

    }}
