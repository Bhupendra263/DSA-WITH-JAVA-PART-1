import java.util.Scanner;
class funct2
{
    public static void main(String[] args)
    {
        greeting();
        greeting();
        greeting();//calling a function for three times to get three hello world
        //if we dont use function then we have to write entire code again and again
        //so to avoid this we use methods
    }
    static void greeting()
    {
        System.out.println("Hello World");
    }
}