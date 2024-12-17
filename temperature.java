import java.util.Scanner;
class temperature
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a temperature in celsius");
        float tempc =sc.nextFloat();
        float tempf =(tempc*9/5)+32;
        System.out.println(tempf);
    }
}