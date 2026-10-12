public class MethodOverloading {

        int a=10;
        int b=20;

        public int add()
        {
            return a+b;
        }
        //function for method overloading
        public int add(int c)
        {
            return a*b*c;
        }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        System.out.println("sum is :"+methodOverloading.add());
        System.out.println("product is :"+methodOverloading.add(8));
    }
    }




