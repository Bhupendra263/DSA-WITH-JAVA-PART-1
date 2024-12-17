import java.util.Scanner;//Scoping
class func10
{
    public static void main(String[]args)
    { int a=10;
    int b=20;

    }
    static void random()
    {
        System.out.println(a);
        //this will give me error
        //it will not allow me to print a 
        //it will say that this function does not know that 'a' exists in
        //some other function
        //only you can acces a in a main function only
    }
}