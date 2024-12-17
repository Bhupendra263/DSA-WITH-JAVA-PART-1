import java.util.Scanner;
class fibo2
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int num1 , num2 , num3=0;
        int i , num;
        System.out.println("Enter a number1");
        num1=sc.nextInt();
        System.out.println("Enter the number 2");
        num2 =sc.nextInt();
System.out.println("Enter the number to which fibonnnaci series should be printed");
num=sc.nextInt();
for(i=2 ;i<=num ; i++)
{
    num3 =num1+num2;
    System.out.print("  "+num3);
    num1  =num2;
    num2=num3;
}   }
}