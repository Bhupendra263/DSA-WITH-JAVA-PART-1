/*Given an array of n integers and a target value x.Print whether x exists in
the array or not using recursion.
Requirements -> f(arr , target , idx)
Bigger Problem -> Starting from index idx , if target is present in array
return true , else return false.

-> Smaller Problem/Recursive Work: f(arr , target , idx+1)
* is target is present in the array starting from index idx

-> Self Work -> Check if current element arr[idx] is equal to target or not.

-> Base Case -> if(idx==n)
                  {
                    return false        //means is there is an empty array or end of array
                  }
 */
import java.util.Scanner;
public class rec_arr4
{
    static boolean search(int[] a , int n ,int target , int idx)
    {
        //base case
        if(idx >= n)
        {
           return false;   //it means hum array ke bahar ye last index pe hai
        }
        //Self Work
        if(a[idx]==target)
        return true;

        //Recursive Work
        if(search(a, n, target, idx+1))
        {
            return true;
        }
        else 
        {
            return false;
        }

    }
    public static void main(String[] args) {
        int[] a = {1 , 2 , 4  ,6 };
        int target = 4;
        int n = a.length;

        if(search(a , target , n , 0))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}