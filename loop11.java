import java.util.Scanner;
class loop11
{
    public static void main(String[]args)
    { int power=1;
        Scanner sc = new Scanner(System.in);
        int a ;
        int b;
        System.out.println("Enter  a number");
        a  = sc.nextInt();
        b = sc.nextInt();
        for(int i =1 ; i<=b ; i++)
        {
            power = power*a;
        }
        System.out.println(power);
    }
}