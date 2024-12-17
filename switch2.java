import java.util.Scanner;
class switch2
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        String fruit =sc.next();
        switch(fruit)
        {
            case"Mango":
            System.out.println("King of fruits");
            break;
            case"Apple":
            System.out.println("A sweet red fruit");
            break;
            case"Orange":
            System.out.println("Sour fruit");
            break;
            case"Grapes":
            System.out.println("small fruit");
            break;
            default:
         System.out.println("Wrong choice");

        }

    }
}