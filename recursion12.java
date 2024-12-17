/*Given two numbers p and q , find the value of p^q using a recursive function. */
/*  p^q = p x p x p x p ....p -> q times.
also we can write it as  
-> p^q = p^q-1 x p^1 = p^(q-1)+1 = p^q.

-> so our subproblem is p^(q-1).
-> self work -> x p
-> base case ->  if(q==0)
{
    return 1;
}
 
f(p, q) = f(p , q-1) x p  if q>0.
f(p , q) = 1      if  q = 0.

f(5,4) = f(5,3) x 5.
*/
import java.util.Scanner;
public class recursion12
{
    static int pow(int p , int q)
    {
        //base case
        if(q==0)
        {
            return 1 ;
        }
        //recursive work
        int smallAns = pow(p , q-1);
        return smallAns*p;
        //self work -> x p
    }
    public static void main(String[] args) {
        System.out.println(pow(5 , 4 ));
    }
}