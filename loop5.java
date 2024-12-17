import java.util.Scanner;
class loop5
{
    public static void main(String[]args)
    {
     Scanner sc =new Scanner(System.in);
     int num=sc.nextInt();
     int sum=0;
     while(num!=-1)
     {
        sum = sum+num;
        num=sc.nextInt();
     }
     System.out.println(sum);
    }
}
