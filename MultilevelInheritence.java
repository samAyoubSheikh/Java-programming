//inheritance exmaple 2
class MultilevelInheritence {
    void eat() {
        System.out.println("Eating....");
    }
}
class Dogs extends MultilevelInheritence {
    void bark() {
        System.out.println("barking....");
    }
}
class BabyDog extends Dogs {
        void weep()
        {
            System.out.println("weeping....");
        }
    }
    class Test{
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }

    }

