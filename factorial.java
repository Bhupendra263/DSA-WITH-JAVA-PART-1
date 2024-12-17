//Print the factorial of a number
import java.util.Scanner;
class factorial
{
    public static void main(String[]args)
    {
        int fact=1;//use 1 in multiplication.
                   //and use sum in addition.
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter  a number");
        num = sc.nextInt();
        for(int i=1 ; i<=num ; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);

    }
}