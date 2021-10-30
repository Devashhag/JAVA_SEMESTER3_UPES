package Collections_PRACTICE;
//lets do it using for each loop

import java.util.ArrayList;

public class p3 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<String>();
        //making the arrray list

        list.add("mango");
        list.add("banana");
        list.add("watermelon");
        for(String fruit:list){
            System.out.println(fruit); //if i put list here so 3 list will be made and in each list it contains all the
            //added items in the list
        }
    }
}
