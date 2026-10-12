public interface A {
    void funA();
}
//this interface will inherit the methods of interface a//
interface Second extends A {
    void funB();
}
class C implements Second{
    @Override
    public void funA() {
        System.out.println("this is fun a");
    }

    @Override
    public void funB() {
        System.out.println("this is fun b");
    }

    public static void main(String[] args) {
        C c=new C();
        c.funA();
        c.funB();
    }
}
