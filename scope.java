class Algebra
{
    int a=10;
    int b=5;//member variables
    int add()
    {
        return a+b;
    }
    int sub()
    {
        return a-b;
    }
    //a and b puri ki puri class mein kahi bhi access kiye ja skte hai.
    //kisi bhi method mein constructor mein khi bhi.
    //so this is a class level scope.
}
public class scope{
    public static void main(String[]args)
    {

    }
}