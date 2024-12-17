/* Print the max value of the array using recursion.
 -> arr[ 3 , 10 , 3 , 2 , 5 ]
 * So agar array ko pehle toh traverse krna pdega recursion se
   and  woh hum krte hai extra element idx leke.
  Bigger Problem -> f(arr, idx)  
  -> Find the maximum value from the given array.
  Note -> max value in the array  starting from index idx.
  Smaller problem/Recursive work -> f(arr , idx+1) i.e find max[10 , 3 , 2 , 5 ]

  Self Work -> Comparision between value given by recursion and self work value.

  Base Case -> if(idx==n-1)
  {
    return arr[idx]
  }


 */
import java.util.Scanner;
public class rec_arr2 {

    static void printArray(int[] arr , int idx)
{

}
static int maxInArray(int[] arr , int idx)
{
    // base case
    if(idx==arr.length-1)
    {
        return arr[idx];
    }
  // small problem -> idx+1 , end of the array -> max-> recurive work.
  int smallAns = maxInArray(arr, idx+1);

  //self work and final answere
    return Math.max(arr[idx]  , smallAns);
}
    
    public static void main(String[] args) {
        int[] arr = {5 , 6, 7, 8, 9};
       // printArray(arr, 0);
        System.out.println(maxInArray(arr , 0));
    }
}
