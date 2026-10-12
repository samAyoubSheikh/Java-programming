public class NestedIf {
    public static void main(String[] args)
    {
        String address="delhi,india";

        if(address.endsWith("india"))
        {
            if (address.contains("jammu"))
            {
                System.out.println("your city is jammu");
            } else if (address.contains("delhi")) {
                System.out.println("your city is delhi");
            }
            else{
                System.out.println("you are not living in india");
            }
        }
    }
}
