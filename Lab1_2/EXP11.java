//Define fb. If point p is (x,y) then p.fb() will make it (2x,x+y). (20,4) (40,24)
//Define fc. If point p is (x,y) then p.fc() will make it (x+y,x*y). (20,4) (24,80)
//CODE BY DEVASHISH AGARWAL 500082411

package Lab1_2;
import java.util.Scanner;

public class EXP11 {

        public void fb(int x,int y){
            y=x+y;
            System.out.println("("+2*x+","+y+")");
        }
        public void fc(int x,int y){
            int c,d;
            c=x+y;
            d=x*y;
            System.out.println("("+c+","+d+")");
        }
        public static void main(String[] args) {
            EXP11 EXP11=new EXP11();
            Scanner scanner=new Scanner(System.in);
            int x,y;
            System.out.println("Enter 1st number x :");
            x=scanner.nextInt();
            System.out.println("Enter 2nd number y :");
            y=scanner.nextInt();
            EXP11.fb(x, y);
            EXP11.fc(x, y);
            scanner.close();
        }
    }
//CODE BY DEVASHISH AGARWAL 500082411
