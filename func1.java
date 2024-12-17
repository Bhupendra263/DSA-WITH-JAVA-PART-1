import java.util.Scanner;
class func1
{
    public static void main(String[]args)
    {
       sum(); //calling  a function
       sum(); //calling a function again
             //can be called without creating object ,because of static keyword.
    }
    static void sum()  //function
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int a =sc.nextInt();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        int sum =a+b;
        System.out.println("The sum=" +sum);
    }
}