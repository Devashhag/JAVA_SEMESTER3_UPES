package Collections_PRACTICE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class p6 {
    public static void main(String[] args) {
   //creating the array list
        ArrayList<String> list = new ArrayList<String>();
        list.add("ravindar");
        list.add("shyam");
        list.add("raju");
        list.add("ajay");

        System.out.println("travering through  list iterator");
        //here the elements in the reverse order
        ListIterator<String> list1= list.listIterator(list.size());
        //down to the up
        System.out.println("down to up order  -->");
        while(list1.hasPrevious()){
            String str= list1.previous();
            System.out.println(str);

        }

        System.out.println("up to down  -->");
        while(list1.hasNext()){
            String str1= list1.next();
            System.out.println(str1);
        }
        //traversing through the for loop
        System.out.println("using the for loops -->");
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        System.out.println("traversing through the for each element");
        list.forEach(a->{///here we are using the lambda expression
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr=list.iterator();
        itr.forEachRemaining(a-> //Here, we are using lambda expression
        {
            System.out.println(a);
        });
    }
}
