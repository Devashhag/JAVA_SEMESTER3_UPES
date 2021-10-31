//3.Write a program for the following HashSet
//
//copy another collection object to HashSet object.
//delete all entries at one call from HashSet
//search user defined objects from HashSet
//CODE BY DEVASHISH AGARWAL 500082411

package LAB10_COLLECTIONS;
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        //part 1
        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("melon");
        list.add("banana");
        list.add("kiwi");

        Iterator i = list.iterator();
        System.out.println("The data of array list are-->");
        while (i.hasNext()) {
            System.out.println(i.next());
        }


        HashSet<String> hs = new HashSet<String>(list);
        System.out.println("Data of hashset after copy another collection object to HashSet object==>");
        Iterator i2 = hs.iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next() +" \n");
        }
//part no 2
        System.out.println("deleting all the entries from the hashset");
        hs.clear();
        System.out.println("entries after clearing are");
        i2 = hs.iterator();
        while (i2.hasNext()) {
            String string = (String) i2.next();
            System.out.print(string+" ");
        }

        //part no 3
        //making one user defined hashset
        HashSet<Songs> s= new HashSet<Songs>();
        Songs s1= new Songs(52,"Cant_feel_my_face","The_Weeknd");
        Songs s2= new Songs(45,"Diamonds","Rihanna");
        Songs s3= new Songs(89,"Work","Rihanna");
        Songs s4= new Songs(79,"Dusty_Blue","Charles_Bradley");
        Songs s5= new Songs(4,"Phantoms_and_friends","Old_man_Canyon");
        //adding the songs to the hashset
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);

        //traversing
        System.out.println("list of the Songs -->");
        for(Songs song:s){
            System.out.println(song.id+"   "+song.name+"    "+song.singer);
        }
        boolean b1= s1.singer.contains("The_Weeknd");
        System.out.println(" is the singer name The_Weeknd in the hashset s1? "+b1);

        boolean b2= s2.singer.contains("Rihanna");
        System.out.println("is the singer name Rihanna in the hashset s2? "+b2);

        boolean b3= s2.name.contains("Diamonds");
        System.out.println("is the song name in hashet s2 is Diamonds ? "+b3);

        boolean b4= s3.singer.contains("Drake");
        System.out.println("is the singer name is hashset s3 is Drake? "+b4); //returns false
    }
}

//for user defined hashset part no3
class Songs{
    int id;
    String name,singer;
    public Songs(int id,String name,String singer){
        this.id=id;
        this.name= name;
        this.singer=singer;
    }
}//CODE BY DEVASHISH AGARWAL 500082411