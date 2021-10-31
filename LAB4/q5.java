//5.Design a class employee of an organization. An employee has a name, empid, and salary.
// Write the default constructor, a constructor with parameters (name, empid, and salary)
// and methods to return name and salary. Also write a method increaseSalary that raises
// the employee’s salary by a certain user specified percentage. Derive a subclass Manager from
// employee. Add an instance variable named department to the manager class. Supply a test
// program that uses these classes and methods.

//CODE BY DEVASHISH AGARWAL 500082411
package LAB4;
class Employee {
    String name;
    int empid;
    float Salary;

    Employee() {
        // this is defalut constructor
    }

    Employee(String name, int empid, float Salary)
    {
        this.name = name;
        this.empid = empid;
        this.Salary = Salary;
    }

    void printdetails()
    {
        System.out.println("Employee Name " + name);
        System.out.println("Employee ID " + empid);
        System.out.println("Salary " + Salary);
    }

public void incSalary(float h)
{
    Salary=(Salary+(Salary*(h/100)));
    System.out.println("Increased Salary is : "+(Salary+(Salary*(h/100))));
}
}

class Manager extends Employee
{
    void department(String department) {
        System.out.println("Department is "+ department );
    }
}

public class q5 {
    public static void main(String[] args) {
        Employee e = new Employee("Amit", 4598, 45000);
        Manager m = new Manager();
        m.department("Finance Department");
        e.printdetails();
       e.incSalary(20);

    }
}
//CODE BY DEVASHISH AGARWAL 500082411