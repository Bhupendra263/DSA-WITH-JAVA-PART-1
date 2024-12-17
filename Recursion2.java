/* Write a  program to print all natural numbers from 1 to n 
 using recursion.
 so ise hum simply for loop ke help se print kr skte hai but hume ise solve krna hai 
 recursion se kyuki hum recursion ko sikhna chah rhe hai.
 suppose we have  a method
  void pi(int n )
  {
    if(n==1)
    {
        sout(1);
        return ;  //Base Case
    }
why base case is imp : because if n = 1 then pi(0) will return invalid input 
as 1 se  0 tak print krna ka koi sense nhi bna . so humne base case lga diya
jiski wajah se ye problem arise nhi hogi. And if n = 1 then then simply 1 will be 
printed and the method will get terminated.  

   Assumption : pi(n-1) // it will return n-1 numbers
   Self Work : Sout(n)
  }
  pi(5) = 1 2 3 4 5. 
  pi(4) = 1  2 3 4. 
  pi(3) = 1 2  3.
  pi(2) = 1 2. 
  pi(1) = 1 .
  pi(n) = pi(n-1).n
  So hum ye assume krege ki pi(n-1) hume n-1 numbers print krke dega : 1 , 2, 3...n-1
  * But humare method ka goal hai ki hum n numbers tak method ko print kre
  so n ko hum print kra dega(self work)
  n = 5 : 1 , 2, 3, 4
     sout(5); 
    
 */
import java.util.Scanner;
public class Recursion2
{
    static void printIncreasing(int n ) //{1 , 2, ....n-1 , n}
    {
           if(n==1)
           {
            System.out.println(n);
            return; /*  Base case. 
            this condition is written for the smallest value jiska answere 
            humein pta tha. means  1 dene pe 1 hi atta
            A base case prevents the program
            from a stack overflow , means infinite recursion se bacchati hai.
            so this is base case is also known as  halting condition.
            */
            
           }
           printIncreasing(n-1);/*And ye hai main problem ki choti
          problem(subproblem) , humare liye badi problem thi 1 to n tak number
          print krna and 1 to n-1 uski choti problem hai(subproblem)

           1 ,  2 , ... n-1  : Assumption/Faith. 
          Hume nhi pta ye 1 , 2, 3,  4 kaise print krega but krdega.*/

          /* now smaller problem se n-1 tak ka kaam toh hogya lekin n kaise print hoga
          ye hume khud krna pdega.   
           */
           System.out.println(n); //Self Work. 1 , 2, 3, ...n.
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        printIncreasing(n);
    }
}
