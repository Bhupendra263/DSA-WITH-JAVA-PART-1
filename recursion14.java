 /* Given  a number num and a value k. Print k multiples of num. 
  * constraints: k>0
  -> input 1: num =12 , k = 5.
  -> output 1 : 12 , 24 , 36 , 48 , 60.
  
  -> input 2: num = 3 , k=8.
  -> output 2: 3 , 6 , 9 , 12 , 15 , 18 , 21 , 24.


  * Big Problem: f(n , k) -> This function prints k multiples of number n.
 so we know the bigger problem.

  * Small problem(recursive work) : so hum k-1 multiples ko nikalege -
  and jo akhiri multiple hoga woh n*k se nikal jayega.
 
  so our smaller problem is f(n , k-1)
   
  * Self Work : print(n*k)

  * Base Case :  if(k==1)
  {
    sout(n);
    return ;
  }

 */
 import java.util.Scanner;
 public class recursion14
 {

    static void printMultiples(int n , int k)
    {
       //base case
       if(k==1)
       {
        System.out.println(n);
        return;
        /* or (if k==0)
        {
            return
        }
        */
       }
       //recursive work
       printMultiples(n, k-1);
       System.out.println(n*k); //self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMultiples(n, k);
    }
 }