/*Given an array , print all its values recursively.
   arr = {5 , 4 , 2 , 3 }
 * Bigger Problem -> f(arr , idx) . 
 -> For a given array arr , print all elements starting from index idx.

 ->Here arr is a given array and idx is a current index on which we 
 are currently pointing.

  * Smaller Problem/recursive work -> f(arr , idx+1)
  * Self Work -> sout(idx) .

  * Base case -> Empty Array.
 */ 
import java.util.Scanner;
public class rec_array1 {
    
    static void printArray(int[] arr , int idx) //5 , 6 , 7 , 8 
    {
        //base case
        if(idx==arr.length)
        {
        return ;
     }
    //self work
    System.out.println(arr[idx]);
    //recursive Work
    printArray(arr , idx+1);
}
    public static void main(String[] args) {
        int [] arr = {5 , 6 , 7 , 8  };
        printArray(arr, 0);
    }

}