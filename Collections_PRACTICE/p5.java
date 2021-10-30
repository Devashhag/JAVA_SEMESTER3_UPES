package Collections_PRACTICE;


import java.util.*;

//sorting the arrays
public class p5 {
    public static void main(String[] args) {
        // creating a list of fruits
        List<String> list1 = new ArrayList<String>();
        list1.add("mango");
        list1.add("banana");
        list1.add("kiwi");
        list1.add("watermelon");
        //sort the list
        Collections.sort(list1); //collection and collections are 2 different things

        for(String fruits:list1){
            System.out.println(fruits);
        }

        System.out.println("sorting the numbers ");
        // ican also add it in this way
        //List<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(2);
        list2.add(10);
        list2.add(45);
        list2.add(23);
        list2.add(1);
        Collections.sort(list2);
for (Integer nos:list2){
    System.out.println(nos);
}


    }


}
