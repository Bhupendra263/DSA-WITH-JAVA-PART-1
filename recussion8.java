/* Program is to find nth fibonacci number.
 * -> 0 , 1 , 1  , 2 , 3 , 5  , 8 , 13 , 21
 * fibonacci series is the series in which the sum of two term gives the result
 * of the preceeding terms.
 * current tem = previous term + previuosprevious term.
 *  0th and 1st term fix hai kyuki unka sum nikalne ke liye humare pass 2 
  numbers hai hi nhi.

  ->  Recursion

  *   Subproblem -> f(n) =  f(n-1) + f(n-2).
                 -> f(6) = f(5) + f(4).
                 here f(n-1) and f(n-2) is our subproblem.

 * Self Work   -> f(n) = f(n-1) + f(n-2)   //adding these two is our self work.
 * Base Case   -> n = 0 and n = 1           
 */
import java.util.Scanner;
public class recussion8
{
    static int fib(int n )
    {
        //base case
        if(n==0)
        {
            return 0 ;
        }
        if(n==1)
        {
            return 1 ;  /* or write if(n==0  || n==1)
                           {
                            return n ;
                           }
                               */
        }
        //subproblem
        int prev = fib(n-1);
        int prevPrev = fib(n-2); //trust

        return prev + prevPrev; //Self Work

    }
    public static void main(String[] args) {
        for(int i = 0 ; i<=10 ; i++ )
        {
        System.out.println(fib(i));
        }
        
    }
}