/*Given  a number n. Find the sum of all natural numbers till n but with
 alternate signs.
 That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answere.
 constraints: 0<=n<=10 ^6

 -> Input 1: n=10
-> Output 1: -5

-> Input2 : n = 5
-> Output2 : 3
 
Lets see it for 1 + 2 + 3 + ....n-1 + n first.

->f(n) is our bigger roblem -> which is sum of 1 to n.

->f(n-1) is our subproblem .

-> then add n which is our self work.

->Recurrence Relation : f(n) = f(n-1) + n.  for n>0

-> Base Case  : if(n==0)
{
    then return 0
}

 */
import java.util.Scanner;
public class recursion15 {
  static int seriesSum(int n)
  {
    //base case
    if(n==0)
    {
        return 0;
    }
    return seriesSum(n-1) + n; //recursive work  
    // + n -> self work
     


  }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
