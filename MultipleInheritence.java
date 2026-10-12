class MultipleInheritence {
    void msg()
    {
        System.out.println("hello");
    }
}
class B{
    void msg()
    {
        System.out.println("welcome");
    }
}
//class cannot extend multiple classes
//class C extends MultipleInheritence,B{
//    public static void main(String[] args) {
//
//    }
//}