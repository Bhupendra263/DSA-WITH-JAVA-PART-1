/* Now p^q = p^q/2 + p^q/2 bhi likh skte hai.
 * for example -> 5^4 = 5^2 x 5^2.
 * but there is one problem in this approach we can only use this approach 
 * only if q is even.
 * 5^7 -> 5^7/2 x 5^7/2 -> 5^3 x 5^3 -> 5^6.
 * so in odd case multipy an extra q -> 5^6 x 5 -> 5^7.
  */
import java.util.Scanner;
public class recursion13 {
static int pow(int p , int q)
{
    if(q==0)
    return 1;
    int smallPow = pow(p , q/2);
    if(q%2 == 0)
    {
        return smallPow * smallPow;

    }
    else{ //odd
            return p * smallPow * smallPow;
    }
   
}
    
public static void main(String[] args)
    {
        System.out.println(pow(5 , 4));
    }
}