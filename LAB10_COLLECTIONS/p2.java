
//2.Write a program for the following HashMap
//
//find whether specified key exists or not.
//find whether specified value exists or not
//get all keys from the given HashMap
//get all key-value pair as Entry objects

//CODE BY DEVASHISH AGARWAL 500082411

package LAB10_COLLECTIONS;

import java.util.*;
import java.util.Map.Entry;


public class p2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<Integer,String >();
        hash.put(45,"Rahul");
        hash.put(40,"Ram");
        hash.put(24,"Mihir");
        hash.put(29,"Ravi");
        hash.put(30,"Sanjay");
        hash.put(56,"Ranbir");

        //part 1
        //condition for the key
        System.out.println("part 1-->");
        boolean a= hash.containsKey(45);
        System.out.println("is 45 key preseent in the hashmap? "+a);

        boolean b = hash.containsKey(24);
        System.out.println("is 24 key present in the hashmap? "+b);

        boolean c = hash.containsKey(49);
        System.out.println("is 49 present in the hashmap? "+c);
//part no2
        System.out.println("part 2-->");
        boolean a1= hash.containsValue("Rahul");
        System.out.println(" is Rahul present in the hashkey value? "+a1);

        boolean a2= hash.containsValue("Ram");
        System.out.println("is Ram present in the hashkey value? "+a2 );

        boolean a3 =hash.containsValue("Dev");
        System.out.println("is Dev present in the hashkey value? "+a3);


        //part 3
        System.out.println(" the KEY'S of given hashmap are ");
        Iterator<Integer> i = hash.keySet().iterator();
        while (i.hasNext()) {
            Integer q=  i.next();
            System.out.println(q);
        }

            //part 4
        System.out.println("part 4 ==>");
        System.out.println("Key value pairs are");
        Iterator<Entry< Integer,String >> itr = hash.entrySet().iterator();
        while(itr.hasNext())
        {
            Entry< Integer,String > entry = itr.next();
            System.out.println(" Key= " + entry.getKey() + "  Value=  " + entry.getValue());
        }

        }

    }

//CODE BY DEVASHISH AGARWAL 500082411