package Lab1_2;

public class EXP1_Q8_2 {
    static class Student  //MAKE STATIC CLASS
    {
        private String name, city;
        private int age;
        public void getData(String x, String y, int t)
        {
            name=x;
            city=y;
            age=t;
        }
        public void printData()
        {
            System.out.println("Student name ="+name);
            System.out.println("Student city ="+city);
            System.out.println("Student age ="+age);
        }
    }
    static class Cs
    {
        public static void main(String args[])
        {
            Student s1=new Student();
            Student s2=new Student();
            s2.getData("Kapil","Delhi",23);
            s2.printData();
            s1.getData("Amit","Dehradun",22);
            s1.printData();
        }
    }
}
