class A{
    public void foo(){
        System.out.println("Base class");
    }
}
class B extends A{
    
    public void foo(){
        System.out.println("Derived class");
    }
}
public class Override {
    public static void main(String[] args) {
        A a = new B();
        a.foo();

    }
}
