public class Calculate {
    int a;
    int b;

    public Calculate(int x,int y)
    {
        this.a=x;
        this.b=y;

    }
    public int add()
    {
        int res=a+b;
        return res;
    }
    public int Subtract()
    {
        int res=a-b;
        return res;
    }
    public int multiplication()
    {
        int res=a*b;
        return res;
    }
    public int division()
    {
        int res=a/b;
        return res;
    }
}
