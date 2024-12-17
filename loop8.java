//Program to count frequency of  a Number
import java.util.Scanner;
class loop8
{
    public static void main(String[]args)
    {
     int remainder=0;
     int count=0;
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    int originalnum = num;
        while(num!=0)
        { 
            remainder = num%10;//to extract each digit of a number
            num=num/10;
            count++;

        }
        System.out.print("number of digits in " + originalnum + " = " + count);
    }

}