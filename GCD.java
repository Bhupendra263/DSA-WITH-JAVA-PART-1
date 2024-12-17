/*Find GCD using recursion.
 
* Given two numbers x and y. Find the greatest common divisor of x and y using recursion.
-> constraints: 0<=x , y<=10^6
-> Input1 : x = 4 , y = 9.
-> Output1 : 1

* Brute force approach:
ex-> 12 and 16
    ->gcd(x, y)<=min(x, y)
    ->12 se divide krna start krege kyuki 15 se dono toh hoga nhi 
    ->so chote wale no. se start krege.
   -> 12 se dono no. divide nhi hoga  , 11 , 10 , 9, 8, 7, 6 , 5 se bhi nhi hoga 
   -> now 4 se dono divide ho jayge so yeh humara GCD ho jayega.
   -> code this approach by yourself (practice).

   -> Now We will se the long division method(revise).
 */
import java.util.Scanner;
public class GCD{

  static int gcd(int x , int y)
  {
      while(x%y != 0)
      {
        int rem = x%y;
        x=y;
        y=rem;
      }
      return y;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int  x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(gcd(x, y));
  }
}