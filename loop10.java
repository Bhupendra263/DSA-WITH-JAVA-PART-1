//Find the sum of the following Series-
//1-2+3-4....n
import java.util.Scanner;
class loop10
{
    public static void main(String[]args)
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i=1 ; i<=num ; i++)
        {
             if(i%2==0)
             sum=sum-i;
             else
             sum=sum+i;
        }
        System.out.println(sum);
    }

}