import java.util.Scanner;
public class recursion9
{
    static int fib(int n )
    {
        
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2); 
        
    }
    public static void main(String[] args) {
        for(int i = 0 ; i<=10 ; i++ )
        {
        System.out.println(fib(i));
        }
        
    }
}
/* Time Complexity = No. of recursive calls * Time taken in 1 call.
                   = O(n).
 
*/