/* Find the value of the factorial n 
where n>=0 .
* Firstly we will find  subproblem
f(5) = 5 x 4 x  3 x 2 x 1.
f(5) = 5 x f(4).
f(4) = 4 x 3 x 2 x 1.
f(n) = n x f(n-1)
 so f(n-1) is our subproblem.

 Note as f(0) = 0 x  f(-1) which is not valid. so 
 n>=1 (n  should be greater than equal to 1 ) for the formula f(n-1).

 *Self Work - n x f(n-1) . Here multiplying an n is our self work 

 * Note:  n x f(n-1) - This is called a Recurrence Relation.
Humari choti problem aur badi problem ke beech jo relation bnta hai use hum recurrence
relation kehte hai.

* Base Case : smallest problem for which we know thw answere obviously.
 if(n==0)
 {
    return 1 ;  
 // as f(0) = 1 
 }

*/
 import java.util.Scanner;
 public class recursion6
 {
    static int factorial(int n )
    {
     //base case.
     if(n==0)
     {
        return 1 ;
     }
     //recursive work.
     int smallAns = factorial(n-1);  //factorial(4) = 24.

     //big problem - self work
     int ans = n * smallAns; // variable bnane ki jagah hum directly return bhi kr skte hai.
     return ans ;   /* n x smallAns , also smallAns ki jagah directly hum 
                     n x factorial(n-1) return kr skte hai.
                     so return n x factorial(n:n-1)   */
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
 }
