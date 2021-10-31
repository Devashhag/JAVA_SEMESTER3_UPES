//4.Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning.
// The charges depend on the duration and the type of the call.
// Write a program using the concept of polymorphism in Java to calculate the charges.

//CODE BY DEVASHISH AGARWAL 500082411
package LAB4;
class trunk{
    float duration;
    float charge;
    trunk(){
        duration =0;
        charge =0;
    }
    trunk(float f ){
      duration=f;
    }
    void calculate_charge(){
        System.out.println("ERRORR....");
    }
}
class ordinary extends trunk{
    float call_rate;

    ordinary(float f){
        super(f);
        call_rate=1.0f;
    }

    void  calculate_charge(){
        charge=duration*call_rate;
        System.out.println("for ordinary charge its "+charge);
    }
}
class urgent extends trunk{
    float call_rate;

    urgent(float f){
        super(f);
        call_rate=2.3f;
    }

    void calculate_charge(){
        charge=duration*call_rate;
        System.out.println("for urgent charge "+charge);
    }
}
class lightning extends trunk{
    float call_rate;

    lightning(float f){
        super(f);
        call_rate=5.2f;
    }

    void  calculate_charge(){
        charge=duration*call_rate;
        System.out.println(" for lightning charge"+ charge);
    }
}
public class q4 {
    public static void main(String[] args) {
        trunk t =new trunk();
        ordinary o =new ordinary(3);
        urgent u =new urgent(4);
        lightning l =new lightning(5);
      t =o;
        t.calculate_charge();
        t=u;
        t.calculate_charge();
        t=l;
        t.calculate_charge();
    }
}//CODE BY DEVASHISH AGARWAL 500082411
