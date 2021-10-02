package Lab1_2;

 class Student {
   public String name;
    public String city;
    private double cgpa;
    public static int stuCount=0; // static is going to make a copy and shared by all objects
    void changecgpa(double x){
        ++stuCount; //count the number of students
        cgpa=x;
    }

    void printcgpa(){
        System.out.println("CGPA"+cgpa);
    //    System.out.println("Total Students:"+stuCount);
    }
//lets remove the public( no problem)
      //String name;
      //String city;
      //double cgpa;
     // private (private access ) cannot use them if using private
 // private String name;
   //   private String city;
   //  private double cgpa;
}
class Demomain{
    public static void main(String[] args) {
        Student Amit= new Student();
        Amit.name="AMIT KUMAR";
        Amit.city="Kanpur";
        Amit.changecgpa(7.77);


        //Amit.cgpa=7.65;
        System.out.println("Name: " + Amit.name);
        System.out.println("City: "+Amit.city);
        //System.out.println("CGPA: "+Amit.cgpa);
        Amit.printcgpa();

        Student Sumit =new Student();
        Sumit.name="SUMIT SHARMA";
        Sumit.city="DEHLI";
        Sumit.changecgpa(5.76);
        System.out.println("NAME:"+Sumit.name);
        System.out.println("CITY:"+Sumit.city);
        Sumit.printcgpa();

        //another purpose of keeping static
        System.out.println();
        System.out.println("Total Students: "+Student.stuCount);
    }
}
