import java.util.Scanner;
class func5
{
    public static void main(String[]args)
    {
        int ans =sum3(20 ,30);
        System.out.println(ans);
        //passing the value of numbers when you are calling the method in main
        //we do it via parameters 
        

    }
    static int sum3(int a ,int b) //parameters a and b.
    //name doesn't matter you can take anything.
    {
        int sum =a+b;
        return sum;
    }

}