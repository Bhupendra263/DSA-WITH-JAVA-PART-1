import java.util.Scanner;
class reverse
{
    public static void main(String[]args)
    {   int num;
    int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        while(num!=0)
        {
            int remainder = num%10;
            num =num/10;
            rev =rev*10+remainder;
        }
        System.out.println(rev);
    }
    
}