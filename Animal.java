//inheritance exmaple 2
public class Animal {

    public void eat() {
        System.out.println("I can eat you alone");
    }
}
class Dog extends Animal{
    public void bark()
    {
        System.out.println("barking....");

    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        {
            dog.bark();
            dog.eat();

        }
    }
}
