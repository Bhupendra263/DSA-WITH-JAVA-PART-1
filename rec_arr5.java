/* Given an array arr of size N and an integer X. The task is to find all the
 indices of the integer X in the array.
 Input arr = {1 , 2, 3 , 2  , 2, 5} , X = 2 
 Output : 1 3  4
 Input arr[] = {8 , 8 , 8} , X = 8
 Output : 0 1 2
 */
import java.util.Scanner;
class rec_arr5
{
    static void findAllIndices(int[] a , int n , int target , int idx) 
    {
        //base case
        
        if(idx>=n)
        {
            return;
        }

        //self work
        if(a[idx]==target)
        {
            System.out.println(idx);
        }

        //recursive work
        findAllIndices(a, n, target, idx+1); 
    }
    public static void main(String[] args) {
        int[] a = {1 , 2 , 4 , 4, 4  ,6 };
        int target = 4;
        int n = a.length;
        findAllIndices(a, n, target, 0);

        
    }
    
}