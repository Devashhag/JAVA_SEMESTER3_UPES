//1.Write a program for the following
//Read all elements from ArrayList by using Iterator.
//Create duplicate object of an ArrayList instance.
//Reverse ArrayList content.


package LAB10_COLLECTIONS;
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        // part no1
        ArrayList<String > list =new ArrayList<String>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Rahul");
        list.add("Mihir");
        list.add("Sanjay");
        list.add("Vishal");
        Iterator itr= list.iterator(); ///used for getting the iterator
        System.out.println("NAMES ARE ==>");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//part no 2
        ArrayList<String> copy= (ArrayList<String>) list.clone();
        System.out.println("duplicate instance of array list is \n"+copy);

        //part 3 reverse the contents of array list
        System.out.println("reverse order of the list is ==>");
        Collections.reverse(list);
        Iterator itr1 =list.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
