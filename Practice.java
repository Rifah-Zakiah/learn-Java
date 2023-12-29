/*
 * @author Rifah Zakiah
 */
interface A{
   void func1();
   void func2();
   void func3();
   void func4();
   void func5();
}
abstract class B implements A{
    public void func1(){
        System.out.println("This is func1 from abstract class B");
    }
    public void func2(){
        System.out.println("This is func2 from abstract class B");
    }
}
class C extends B{
    public void func3(){
        System.out.println("This is func3 from concrete class C");
    }
    public void func4(){
        System.out.println("This is func4 from concrete class C");
    }
    public void func5(){
        System.out.println("This is func5 from concrete class C");
    }
}
public class Practice {
    public static void main(String[] args) {
        A a = new C();
        a.func1();
        a.func2();
        a.func3();
        a.func4();
        a.func5();
    }
}
