public class TheOperator{
    public static void main(String[] args) {
        int a=100,b=20,c=30;
        int result;

       result= (a>b) ?(a>c) ?a : c:(b >c) ? b : c ;
        System.out.println("The max value is :"+result);
    }
        }
//        if (a>b && a>c )
//        {
//            System.out.println("The max value is A:"+a);
//        }
//        else if (b>a && b>c){
//            System.out.println("the max value is B:"+b);
//        }
//        else{
//            System.out.println("the max value is C:"+c);
//        }
