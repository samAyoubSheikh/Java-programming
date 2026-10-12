import static java.lang.Character.getNumericValue;

public class TypeConversion {
    char ch ='1';
    int a = getNumericValue(ch);

    public void dis()
    {
        System.out.println("char value is "+ch);
        System.out.println("after converting into int , value is "+a);
        //this will understand us that it is converted into int
        int sum=a+1;//if we will do sum=ch+9 it will print 69
        System.out.println(sum);

    }
}
