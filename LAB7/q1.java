//1.Write a program in Java to display the names and roll numbers of students.
// Initialize respective array variables for 10 students.
// Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program.
//

//CODE BY DEVASHISH AGARWAL 500082411
package LAB7;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        //initializing the names and roll no in arrays
        String [] name ={"rahul","shyam","hari","devansh","rohit","mihir","vansh","varun","atul","vivek"};
        int [] rollno ={451,870,849,575,989,748,425,987,458,100};

       // for(int i =0;i<rollno.length;i++)
         //   System.out.println(rollno[i]);
        System.out.println(Arrays.asList(name));//static method, It accepts an array as an argument. It returns the list view of an array.
        System.out.println(Arrays.toString(rollno));//static method takes as argument returns string,,elements of array converted to string

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name and roll no index value's ");

            String element1 = sc.next();
            int element = sc.nextInt();
            System.out.println("The name of the student is  "+name[Integer.parseInt(element1)]);
            System.out.println("The roll number of student is  "+rollno[element]);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("this is an array out of bound exception .");
        }
    }
}
//CODE BY DEVASHISH AGARWAL 500082411