public class CopyConstructor {
    String name;
    int id;

    //
    public CopyConstructor(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    //copy constructor
    public CopyConstructor(CopyConstructor obj){
        this.id= obj.id;
        this.name=obj.name;
    }

    public static void main(String[] args) {
        System.out.println("Object First ");
        CopyConstructor c1=new CopyConstructor(90,"sameer");
        System.out.println("My Id is : "+c1.id+"and my name is :"+c1.name);

        CopyConstructor c2=new CopyConstructor(c1);
        System.out.println("Copy Constructor");
        System.out.println("my id is : "+c2.id +"and my name is :"+c2.name);
    }
}