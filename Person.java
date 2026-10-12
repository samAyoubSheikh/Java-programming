public class Person{
    private String name;
    private int age;

    //create a constructor
    public Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    //create a display method
    public void displayInfo()
    {
        System.out.println("Name of the person is : "+name);
        System.out.println("and Age is :"+age);
    }
}
