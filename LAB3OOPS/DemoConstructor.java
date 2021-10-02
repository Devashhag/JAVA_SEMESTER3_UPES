package LAB3OOPS;
  class Student{
private String name;
private String city;
private double cgpa;
// lets construct default constructor
      public Student(){
          name="Amit kumar";
          city="Kanpur";
          cgpa =7.76;
      }

    //parametrized constructor
      //public Student(String x,String y ,double z){} this is pretty confusing so to make it clear use the same names
      public Student(String name,String city,double cgpa){
        this.name =name;         //this. makes the difference bw parameters or fields
        this.city=city;                      //this.name is field and name is parameter
        this.cgpa=cgpa;


        //  name =x;
        //  city =y;
        //  cgpa=z;
      }
          /// lets use copy constructor
      public Student (Student O){
          name=O.name;
          city=O.city;
          cgpa=O.cgpa;
      }


  /*    public void getData(String x,String y, double z){
    name =x;
    city =y;
    cgpa = z;
}     */

public void printData(){
    System.out.println("Name :"+name);
    System.out.println("City :"+city);
    System.out.println("cgpa :"+cgpa);
}
}


public class DemoConstructor {
    public static void main(String[] args) {
        Student Amit =new Student();
     //   Amit.getData("AMIT KUMAR","KANPUR",7.76);
        Amit.printData();

        Student Sumit =new Student("sumit sharma","varanasi",9.6);            // this is done by parameterized constructors   //whenever we are using parametrized we do not require getData
        Sumit.printData();
         // copy of sumit sharma
        Student SumitCopy =new Student(Sumit);
       // SumitCopy=Sumit;
       SumitCopy.printData();



    }
}
