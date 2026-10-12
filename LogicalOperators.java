public class LogicalOperators {
    boolean a=true;
    boolean b=false;

    public void andOperator()
    {
        System.out.println("using AND operator");
        if(a && b)
        {
            System.out.println("yes it is True");
        }
        else{
            System.out.println("No it is False");
        }
    }
    public void orOperator()
    {
        System.out.println("using OR operator");
        if(a || b)
        {
            System.out.println("yes it is True");
        }
        else{
            System.out.println("No it is False");
        }
    }
    public void notOperator()
    {
        System.out.println("using NOT operator");
        System.out.println(!a);
    }

}
