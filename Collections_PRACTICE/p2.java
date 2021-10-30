package Collections_PRACTICE;

import java.util.ArrayList;
import java.util.Iterator;

//iterating through the iterator
public class p2 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<String>();
    list.add("mango");
    list.add("banana");
    list.add("watermelon");
        Iterator itr= list.iterator(); // getting the iterrator
        while (itr.hasNext()){ //check if iterator has the elemenst or not
            System.out.println(itr.next()); //putting the elements and move to the next
        }
    }
}
