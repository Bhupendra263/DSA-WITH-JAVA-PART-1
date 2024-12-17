import java.util.Scanner;//Scoping
class func10
{
    public static void main(String[]args)
    { int a=10;
    int b=20;
    {
         a =78;
        int c=99;
        //values initialize in this block will remain in this block
    }
    //System.out.println(c);//cannot use outside a block
    System.out.println(a);
    //it w

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