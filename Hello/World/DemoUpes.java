package Hello.World;
import Hello.UpesStudent;

public class DemoUpes {
    public static void main(String[] args) {
        UpesStudent Amit =new UpesStudent();
        Amit.name="Amit Kumar ";
        Amit.city="Kanpur";
        Amit.changeCGPA(8.4);
        System.out.println("NAME:"+Amit.name);
        System.out.println("City:"+Amit.city);
        Amit.printCGPA();

    }
}
