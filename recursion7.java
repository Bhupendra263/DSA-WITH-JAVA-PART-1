
import java.util.Scanner;
public class recursion7
{
   static int factorial(int n )
   {
    //base case.
    if(n==0)
    {
       return 1 ;
    }
       return n * factorial(n-1);
    }

   public static void main(String[] args) {
       System.out.println(factorial(5));
   }
}
/* f(5)
    |
   f(4)
    |
   f(3)
    |
   f(2)
    |
   f(1)
    |
   f(0)     //  This is our Recursive Tree
*/ 