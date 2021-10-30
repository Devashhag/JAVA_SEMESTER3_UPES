package Collections_PRACTICE;

import java.util.ArrayList;

//get and set array in the list
public class p4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("mango");
        al.add("banana");
        al.add("watermelon");
        //accessing the elements using the index values
        System.out.println("returing the element  "+al.get(0));
        System.out.println("returing the element  "+al.get(1));
        System.out.println("returing the element  "+al.get(2));
    //changing the elements
        al.set(1,"strawberry");
        //traversing the list
        for(String fruit:al){
            System.out.println(fruit);
        }

    }
}
