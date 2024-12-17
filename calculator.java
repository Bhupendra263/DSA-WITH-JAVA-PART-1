import java.util.Scanner;
class calculator
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, result;
        System.out.println("Enter any two numbers");
        a =sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter any operator from + , - , /  , *");
        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case'+':
            result =a+b;
            break;
             case'-':
            result =a-b;
            break;
             case'/':
            result =a/b;
            break;
             case'*':
            result =a*b;
            break;
            default:
                System.out.println("You have entered incorrect operator");
                return;
        }
        System.out.println(result);


    }
}