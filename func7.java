import java.util.Scanner;
class func6
{
   public static void main(String[]args)
    {
        swap();
        swap();
    }
    static void swap()
    {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a +" "+b);

    }
}