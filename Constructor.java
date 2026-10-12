//public class Constructor{
//
//    //in this i will see use of constructor
//   public Constructor(){
////        //this message will get automatically invoked when an object of this class is created
//   System.out.println("Hello Constructor");
//    }
////    //this one will work as constructor overloading
//    public Constructor(String name)
//    {
//        System.out.println("My name is :"+name);
//    }
//    public Constructor(String name,int id)
//    {
//        System.out.println("my name is :"+name);
//        System.out.println("my id is:"+id);
//    }
//
//    public static void main(String[] args) {
//        Constructor constructor=new Constructor();//can pass arguments as well
//
//    }
//}
//NEw class default constructor
//class Student3{
//   int id;
//   String name;
//    void display()
//    {
//        System.out.println(id+" "+name);
//    }
//
//    public static void main(String[] args) {
//        Student3 obj=new Student3();
//        obj.display();
//    }
//}
//parameterixed constructor
//Constructor overloading/MEthod Overloading
class Adder {
//    int id;
//    String name;
    static int add(int a,int b)
    {
       return a+b;
    }
    static int add(int a,int b ,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));

    }
}