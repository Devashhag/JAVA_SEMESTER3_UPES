package Lab1_2;

public class EXP1_Q8_H {

        public static void main(String args[])
        {   EXP1_Q8_A3.point a,b,c;float t;
            a=new EXP1_Q8_A3.point();
            a.getPoint(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            a.print();
            a.abc();
            a.print();
            b= EXP1_Q8_A3.point.pqr(a);
            b.print();
            a=new EXP1_Q8_A3.point();
            a.getPoint(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            c=new EXP1_Q8_A3.point();
            c.ghi(a);
            c.print();
            t=a.getx();System.out.println(t);
        }
    }

