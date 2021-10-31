//CODE BY DEVASHISH AGARWAL 500082411

package LAB5;
interface area{
    float  pi= 3.14159f;
    float result(float r,float h);
}
class TSAcylinder implements area{
    public float result(float r,float h){
        return ((2*pi*r*r)+(2*pi*r*h));
    }
}
class VOLcylinder implements area{
    public float result(float r,float h){
        return pi*r*r*h;
    }
}
class CSAcylinder implements area{
    public float result(float r, float h){
        return 2*pi*r*h;
    }
}
public class q3 {
    public static void main(String[] args) {
        TSAcylinder SurfaceArea =new TSAcylinder();
        VOLcylinder Vol =new VOLcylinder();
        CSAcylinder csa = new CSAcylinder();
        area ar;

        ar=Vol;
        System.out.println("volume of cylinder is "+ar.result(3,4));
        ar=SurfaceArea;
        System.out.println("Total surface area  of cylinder  is "+ar.result(3,4));
        ar=csa;
        System.out.println("Curved surface area of cylinder is "+ar.result(3,4));
    }
}
//CODE BY DEVASHISH AGARWAL 500082411