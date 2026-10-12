//inheritence in java
public class Employee {
    int salary=40000;
    String name="haadi";
}
class Programmer extends Employee
{
    float bonus=10000;
    public static void main(String[] args) {
        Programmer p1=new Programmer();
        {
            System.out.println("Programmer is :"+p1.name);
            System.out.println("programmer salary is "+p1.salary);
            System.out.println("programmer bonus is "+p1.bonus);
        }

    }

}

