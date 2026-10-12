import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Decisionif

        //LogicalOperators class object
        LogicalOperators l1=new LogicalOperators();
        {
            l1.andOperator();
            l1.orOperator();
            l1.notOperator();
        }


        //calculate class object
        TypeConversion t1=new TypeConversion();
        {
            t1.dis();
        }
        Calculate c1= new Calculate(10,5);
        {
            System.out.println("sum of digits is :"+c1.add());
            System.out.println("Difference of digits is:"+c1.Subtract());
            System.out.println("prodcut of digits is:"+c1.multiplication());
            System.out.println("division of digits is:"+c1.division());

        }

        Person person1 = new Person(19, "Sameer");
        {
            // Display information about the person
            System.out.println("Person 1 Information:");
            person1.displayInfo();
            person1.setAge(26);
            person1.setName("raja attaullah ");
            System.out.println("Updated Person 1 Information:");
            person1.displayInfo();
        }
      /*  //Car class object creation
        Car car =new Car("BMW",2,10,"sameer");
        {
            System.out.println("first car info ");
            car.displayCarInfo();

            //update car values
            car.setCarName("Mercedees");
            car.setCarPrice(5);
            car.setCarMileage(8);
            car.setCarOwner("raja attaullah");

            System.out.println("car 2 Info");
            car.displayCarInfo();
        }
        UseOfDataTypes useOfDataTypes=new UseOfDataTypes();
        useOfDataTypes.displayInfo();

        OperatorsInJava operatorsInJava=new OperatorsInJava();
        operatorsInJava.ArithmeticOperators();
        operatorsInJava.UnaryOperators();

       */
    }
}


