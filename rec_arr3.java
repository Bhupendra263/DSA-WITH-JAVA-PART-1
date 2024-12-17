/* Find the sum of the elements of the array using recursion.
 arr = [2 , 3, 5, 20 , 1]

 Bigger problem -> f(arr , idx) 
 ->Find the sum of the array starting from index 0.
 Smaller problem/recursive Work  -> f(arr , idx+1)
 ->Sum of the starting from index idx+1 till the end of the array

Base Case -> if(idx==n-1)
             return arr[idx]

Self Work -> Add current Element in smallAns
 
*/
import java.util.Scanner;
public class rec_arr3
{
    static void printArray(int[] arr , int idx)
    {

    }
    static int sumOfArray(int[]arr , int idx )
    {   //Base Case
        if(idx==arr.length)
        {
            return 0;
        }
        //Recurive Work/Subproblem
        int smallAns = sumOfArray(arr, idx+1);

        //Self Work
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 9 , 4};
        System.out.println(sumOfArray(arr, 0));
    }
}