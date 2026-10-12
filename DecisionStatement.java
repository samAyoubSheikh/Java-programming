import java.util.Objects;
import java.util.Scanner;

public class DecisionStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* System.out.println("Enter number first:");
        int x = sc.nextInt();

        System.out.println("Enter second number:");
        int y = sc.nextInt();

        if (x + y >= 20) {
            System.out.println("X + Y is greater than 20");
        } else {
            System.out.println("X + Y is smaller than 20");
        }*/
        System.out.println("Enter City Name :");
        String city=sc.next();
        if ("delhi".equals(city))
        {
            System.out.println("You are in delhi.");
        }
        if ("kashmir".equals(city))
        {
            System.out.println("You are in kashmir.");
        }
        if ("mumbai".equals(city))
        {
            System.out.println("You are in mumbai.");
        }
        if ("jammu".equals(city))
        {
            System.out.println("You are in jammu.");
        }
        if ("kota".equals(city))
        {
            System.out.println("You are in kota.");
        }
        else
        {
            System.out.println("Enter Correct City Name...");
        }

        // sc.close(); // Always good practice to close the scanner
    }
}
