//5.Write program to create an interface StackInterface having methods push (), pop () and display ().
// StackClass implements StackInterface.
// Class
// StackClass contains the main method which is having a switch case for selecting the particular operation of the stack.

package LAB5;
import java.util.Scanner;

interface StackInterface{
     void push(int n);
     void pop();
     void display();
}
class StackClass implements  StackInterface{

    public void push(int n)
    {
        if(top>=MAX-1) { //overflow condition checking
            System.out.println("Stack is in overflow condition /full");
        }
        else {
            top=top+1;
            stack[top]=n;
            System.out.println("Element added to the stack is: "+n);
            display();
        }
    }
    public void pop()
    {
       // int x;
        if(top==-1) //underflow condition
        {
            System.out.println("Stack is in underflow condition /empty");
        }
        else
        {top=top-1;
            display();
        }
    }

    public void display()
    {
        int i;
        if(top==-1)
            System.out.println("Stack is in underflow condition/Empty");
        else {
            for(i=0; i<=top; i++)
                System.out.println("Elements in the stack are: "+stack[i]);
        }
    }

     final int MAX=5;
    int top=-1;
    int[] stack=new int[MAX];
//main method in Stack class using switch case
    public static void main(String args[])
    {
        StackClass s1=new StackClass();

        while(true){
            int input, n;
            System.out.println("1) Push ");
            System.out.println("2) Pop ");
            System.out.println("3) Display Stack ");
            System.out.println("4) Exit ");
            System.out.println("\n Enter the choices : ");
            Scanner s=new Scanner(System.in);
            input=s.nextInt();
            switch(input)
            {
                case 1: System.out.println("Enter the element you want to add :  ");
                    n=s.nextInt();
                    s1.push(n);
                    break;

                case 2: s1.pop();
                    break;
                case 3: s1.display();
                    break;

                    case 4:
                    System.out.println("Exiting from the program.........");
                 break;
                default:
                    System.out.println("Wrong choice !!");
                    return;

            }
        }}
}

