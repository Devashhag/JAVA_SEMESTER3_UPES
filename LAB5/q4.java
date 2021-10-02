//4.Write a program to create an Interface having two methods division and modules.
// Create a class, which overrides these methods.

package LAB5;
interface A1{
    void divisions(int a);
    void modules(int b);
}
class B1{
    String mod_name;
    String div_name;
}
class C1 extends B1 implements A1{

    int a,b,id;
   public void Id(int id){
       this.id=id;
   }

@Override
    public void divisions(int a) {
this.a=a;

    }
@Override
    public void modules(int b){
        this.b =b;

    }
    public String module_name(String mod_name){
       this.mod_name=mod_name;
       return mod_name;
    }

    void show(){
        System.out.println("id is "+id);
        System.out.println("div "+a);
        System.out.println("modules "+b);
        System.out.println("module name is "+mod_name);
    }
}
public class q4 {
    public static void main(String[] args) {
        C1 q= new C1();
      q.Id(569);
        q.divisions(32);
        q.modules(50);

        q.show();

    }
}






























