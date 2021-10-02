package Lab1_2;

public class Exp1_q8_1 {

//Write a program to create a class Student with data ‘name, city and age’ along with method printData to display the
//data. Create the two objects s1 ,s2 to declare and access the values.

    static class Student
    {

        String name, city;   //name city as characterized as string
        int age;
        static int m;  //1) A static int variable remains in memory while the program is running.
        // A normal or auto variable is destroyed when a function call where the variable was declared is over
        // For example, we can use static int to count a number of times a function is called,
        // but an auto variable can't be used for this purpose.
        void printData()
        {
            System.out.println("Studentname=" +name);
            System.out.println("Student city ="+city);
            System.out.println("Student age = "+age);
        }
    }

    static class Cs
    {
        public static void main(String args[])
        {
            Student s1=new Student();
            Student s2=new Student();
            s1.name="Amit";
            s1.city="Dehradun";
            s1.age=22; //int
            s2.name="Kapil";
            s2.name="Delhi";
            s2.name="23"; //its string so use the double " "
            s2.printData();
            s1.printData();
            s1.m=20;
            s2.m=22;
            Student.m=27;
            System.out.println("s1.m = " + s1.m);
            System.out.println("s2.m = "+ s2.m);
            System.out.println("Student.m ="+Student.m);
        }
    }
//in s2 the name keeps on updated from kapil to delhi to 23 so name is set to 23 s2 city is not defined s2 age not defined
}
