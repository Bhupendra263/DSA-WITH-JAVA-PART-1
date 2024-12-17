/* Write a program to print all natural numbers from n to 1 using recursion. */
/*pd(5) ->  5 4 3 2 1 
 * pd(4) -> 4 3 2  1 
 * pd(3) -> 3 2 1 
 * pd(n) -> n , n-1 , n-2 ...2 , 1.
 
 smaller problem : pd(n-1).
 self work : sout(n).
 base case : n = 1. 
 pd(4) -> pd(3) -> pd(2) .
 pd(1)-> base case.
 hume pd(1) ka answere nikalne ke koi aur smaller problem solve nhi krni hai
 means pd(0) ko humein solve krne ki jroorat nhi hai uska answere humein
 pta hai and uska answere hai sidha 1 ko print krna.

 koi aur humara base case kyu nhi tha ? kyuki pd(4) ko solve krne ke liye
 humein pd(3) ka answere chaiye tha and pd(3) ko solve krne pd(2) ka answere chaiye
 hi similarly pd(2) ko solve krne ke liye pd(1) ka answere chaiye , but pd(1) is
 not dependent on any other call.
 */
 import java.util.Scanner;
 public class recursion5
 {
    static void printDecreasing(int n) //5 , 4, 3, 2, 1
    {
      //base case.
      if(n==1)
      {
        System.out.println(1);
        return;
      }
      //self work. Is baar self work pehle likha as order is decreasing.
      System.out.println(n);
      //Recursive work.
      printDecreasing(n-1);
    }

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printDecreasing(n);
 }}