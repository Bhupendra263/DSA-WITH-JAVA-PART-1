/* Q -> Given an integer , find out the sum of its digits using recursion */
/* n = 513  = 5+1+3 = 9 
 * n = 1234 = 1+2+3+4 = 10
 Recursion
 
 * Subproblem -> 1 2 3 4 
 so isme subproblem ho jayegi 1 2 3 ka sum nikalna i.e finding sum of d-1 digits.
 * this is our smallAns.
 * Self work -> Adding last digit.
 * ans = smallAns + last digit.

 f(1234) = f(123) + 4
 f(n) =   f(n/10)  + n%10        //recurrence relation 
  
 here
 f(n) -> sum of digits of n.
 f(n/10) -> sum of all digits except last digit.
 n%10 -> last digit.

 Now what is our 
 * base case 
  0 , 1, ,2 , 3, 4, 5, 6, 7, 8, 9
  so for single digit number we do need to divide or do modulus of a number
  because uska answere whi aa jayega.
  if(n>=0 && n<=9)
  return n;

*/
import java.util.Scanner;
public class recursion10 {

    static int sumOfdigits(int n)
    {
        //base case
        if(n>=0 && n<=9)
        {
            return n;
        }
        //recursive work -> subproblem
        int smallAns = sumOfdigits((n/10));

        //self work
        int ans = smallAns + n%10;
        return ans;

        //also we can directly return sumOfdigits(n/10) + n%10.

    }
    public static void main(String[] args) {
        System.out.println(sumOfdigits(12345 ));
    }
}

/* Time complexity = no. of recursive calls x time taken in one call.*/