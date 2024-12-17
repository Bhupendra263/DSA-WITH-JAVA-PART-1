//Block level Scope 
//These are the variables that are declared inside the pair of brackets{ }
class Algebra
{
    int add()
    {
        int p =100;
        int q =20;
        return p+q;
    }
    
    void demo()
    {
        int a = 10;
        System.out.println(a);//hum yaha pe a toh print kr skte hai but b nhi
        System.out.println(b);//kyuki b ka jo scope woh block level hai.

        {
            int b=10;
            System.out.print(b)//yaha pe error nhi ayegi kyuki block ke andar hum likh
                               //skte hai.
        }
        //so block level ke bahar - ya pehle ya baad mein hum khi bhi variable.
        //ko access nhi kr skte hai.

    }
    
}
public class scope2{
    public static void main(String[]args)
    {

    }
}