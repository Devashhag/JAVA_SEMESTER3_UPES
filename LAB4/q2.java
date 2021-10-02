//2.Write a program in Java to create a Player class.
// Inherit the classes Cricket _Player, Football _Player and Hockey_ Player from Player class.

package LAB4;
class Player{
    String name;
    String club;
    Player( String name, String club){
        this.name=name;
        this.club=club;
    }

     void show(){
         System.out.println("Player name "+ name);
         System.out.println("Club is "+club);
     }
}
class Cricket_Player extends Player {

    Cricket_Player(String name, String club){
        super(name,club);

    }
    public void show1(){
        super.show();
    }
}
class Football_Player extends Player{

    Football_Player(String name ,String club){
        super(name,club);

    }
    public void show1(){
        super.show();
    }

}
class Hockey_Player extends Player {

    Hockey_Player(String name ,String club){
      super(name,club);

    }
    public void show1(){
        super.show();
    }
}

public class q2 {
    public static void main(String[] args) {
Cricket_Player c= new Cricket_Player("aman","cricket");
Football_Player f= new Football_Player("RAHUL","FOOTBALL");
Hockey_Player h = new Hockey_Player("rajesh","hockey");
c.show();
f.show();
h.show();

    }
}


