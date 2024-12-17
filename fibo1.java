import java.util.Scanner;
class  fibo1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=num)
        {
            int temp =b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}