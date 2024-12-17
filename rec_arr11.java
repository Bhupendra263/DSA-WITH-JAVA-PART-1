/* There are N stones , numbered 0 , 1, 2..., N-1. For each
 i(0<=i<N) , the height of Stone i is hi. There is a frog who 
 is initially on Stone 0. He will repeat the following
 action some number of times to reach Stone N-1:

 If the frog is currently on Stone i , jump to Stone i+1 ir i+2.
 Here , a cost of |hi-hj| is incurred , where j is the stone to
 land on.

 Find the minimum possible total cost incurred before the frog 
 reaches Stone N.

 Input n = 4.
 arr[] = 10 30 40 20.
 Output = 30.

 # Frog Problem.

 -> Bigger Problem = f(h , n  , idx) -> If we Starting from index idx , 
 Then What will be minumum cost to 
 reach (n-1)th idx i.e the last index.

 -> Subproblem = h[idx]  - h[idx+1] + f(h , n , idx+1)
               = h[idx] -h[idx+2] +  f(h , n , idx+2)
               //In dono subproblems mein jo minimum hoga woh humara
               final answere hoga.

               -> Base Case
               if(idx==n-1)
               {
                return 0;
               }
 */
import java.util.Scanner;
public class rec_arr11 {
    static int best(int[] h , int n , int idx)
    {
        //Base Case
        if(idx==n-1)
        return 0 ;
        int op1 = Math.abs(h[idx]- h[idx+1] ) + best(h , n , idx+1) ;
        if(idx==n-2)
        return op1;
        int op2 = Math.abs(h[idx]-h[idx+2]) + best(h , n, idx+2);

        return Math.min(op1 , op2);
    } 
     public static void main(String[] args) {
        int[] h = {10 , 30 , 40 , 20};
     System.out.println(best(h, h.length, 0));
     }
}
