public class MethodOverriding {
    void run() {
        System.out.println("I am running...");
    }

    void myName() {
        System.out.println("my name is yasir Jamal....");
    }
}
 class NotMen extends MethodOverriding{
        @Override
        void run()
        {
            System.out.println("i am an Animal and i am also running");
        }
        void animalName()
        {
            System.out.println("Animal is :Cow");
        }

     public static void main(String[] args) {
         NotMen notMen=new NotMen();
         notMen.myName();
         System.out.println("Method run is Overidden from super class");
         notMen.run();
         notMen.animalName();
     }

    }
