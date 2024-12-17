//Find the sum of digits in a given number n
import java.util.Scanner;
class loop9
{
    public static void main(String[]args)
    {
     int remainder=0;
     int sum=0;
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    int originalnum = num;
        while(num!=0)
        { 
            remainder = num%10;//to extract each digit of a number
            num=num/10;
            sum=sum+remainder;
            

        }
        System.out.print("sum of digits in " + originalnum + " = " + sum);
    }

}