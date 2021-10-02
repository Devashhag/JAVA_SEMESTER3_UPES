package LAB8;

public class q5 {
    public static void main(String[] args) {
        //boxing method
        Integer obj = new Integer(123);
        System.out.println("after boxing");
        System.out.println("obj "+obj);

        int a = obj.intValue();
        System.out.println(a);
    }
}
