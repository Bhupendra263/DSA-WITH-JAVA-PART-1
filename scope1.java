//method level scope.
//These are the variables that are declared inside the method and cannot
//be accessed outside the method.
class Algebra
{
    int a=10;
    int b=5;//member variables
    int add()
    {
        int p =100;
        int q =20;
        return p+q;//now p and q variable ko hum add method ke bahar khi bhi access
        //nhi kr skte hai.
        //and this is known as method level scope
        //try it by using p and q in sub method and it will give an error.
    }
    int sub()
    {
        return a-b;
    }
    
}
public class scope{
    public static void main(String[]args)
    {

    }
}