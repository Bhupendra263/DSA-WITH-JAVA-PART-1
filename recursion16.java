/* Now for  1-2+3-4+5-6 ...... + n.
 i.e for alternative sign.
 so we will notice that isme sare even  numbers subtract ho rhe hai and
 jitne bhi odd numbers hai woh add ho rhe hai.

 ->  f(5) = 1-2+3-4 + 5.
 ->  f(n) = f(n-1) + n , if n is odd

 ->  f(6) = 1-2+3-4+5-6.
 ->  f(6) = f(n-1) - n , if n is even

 Base work if(n==0)
 {
    return 0;  // base case is very important because agar base case nhi lgayege then
               stack overflow ho jayega.
 }

 -> so is baar self work conditional ho jayegi.

*/
import java.util.Scanner;
public class recursion16 
{
    static int seriesSum(int n)
    {
        //base case
        if(n==0)
        return 0;
        if(n%2 ==0)
        {
        return seriesSum(n-1) - n;
        }
        else //odd
        {
            return seriesSum(n-1) + n;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
}}
