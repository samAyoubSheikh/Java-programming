public class OperatorsInJava {
    int $a=10;
    int $b=20;
    public void ArithmeticOperators()
    {
        System.out.println("a + b ="+($a+$b));
        System.out.println("a - b ="+($a-$b));
        System.out.println("a * b ="+($a*$b));
        System.out.println("a / b ="+($a/$b));
        System.out.println("a % b ="+($a%$b));
    }
    public void UnaryOperators()
    {
        System.out.println("Post Increment :"+($a++));
        System.out.println("Pre Increment :"+(++$a));

        //now for value of b
        System.out.println("Post Increment :"+($b++));
        System.out.println("Pre Increment :"+(++$b));

    }
    public void RelationalOperators()//or Conditional operators
    {
        System.out.println("a > b :"+($a>$b))
        ;
    }


}
