//CODE BY DEVASHISH AGARWAL 500082411
package Lab1_2;

public class EXP1_Q8_A3 {
    public static class point
    {
        private float x,y;

        public void getPoint(float a,float b){
            x=a;
            y=b;
        }
        public void print()
        {
            System.out.println("("+x+","+y+")");
        }
        public void abc() {
            x=2*x;
            y=3*y;
        }
        public static point pqr(point a)
        { point t;
            t=new point();
            t.getPoint(2*a.x,2*a.y);
            return t;
        }
        public void ghi(point a)
        {
            x=2*a.x;
            y=3*a.y;
        }
        public float getx()
        {
            return x;
        } // function will return x

        public static void main(String[] args) {
           point point=new point(); //object
            point.getPoint(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            point.print();
            point.abc();
            point.print(); /// print the above line
           // pqr(point);//fucntion static call
        }

    }}
//CODE BY DEVASHISH AGARWAL 500082411