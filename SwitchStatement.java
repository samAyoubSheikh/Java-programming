import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Serial number of the month :");
        int i=sc.nextInt();

        switch (i)
        {
            case 1:
                System.out.println("this is January");
            break;
            case 2:
                System.out.println("this is February");
                break;
            case 3:
                System.out.println("this is March");
                break;
            case 4:
                System.out.println("this is April");
                break;
            case 5:
                System.out.println("this is May");
                break;
            case 6:
                System.out.println("this is June");
                break;
            case 7:
                System.out.println("this is July");
                break;
            case 8:
                System.out.println("this is August");
                break;
            case 9:
                System.out.println("this is september");
                break;
            case 10:
                System.out.println("this is October");
                break;
            case 11:
                System.out.println("this is November");
                break;
            case 12:
                System.out.println("this is December");
                break;
            default:
                System.out.println("Please Enter valid Number...");


        }
    }
}
