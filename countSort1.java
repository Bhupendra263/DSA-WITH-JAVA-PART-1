/*  arr = {4 , 3 , 1 , 5 , 3 , 1 , 3 , 5} .

 -> count_arr = { 0 , 2 , 0 , 3 , 1 , 2} .

 -> count = {0 , 2 , 2 , 5  , 6 , 8} // Prefix Sum array.

 -> Output = {1 , 1 , 3 , 3 , 3 , 4 , 5 , 5 } .
*/
import java.util.Scanner;
public class countSort1 {
    static int findMax(int[] arr)
    {
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++ )  
        {
            if(arr[i] > mx)
            {
                mx = arr[i];
            }
        }
        return mx;
    }
    static void basicCountSort(int[] arr) // 2 4 2 2
    {
        //find the largest element present in the array.
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i = 0 ; i< arr.length ; i++ )
        {
            /*
             0 0 3 0 1
             0 1 2 3 4

         */
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0 ; i<count.length ; i++) // 0 2 0 3 1 2 
        {
            for(int j = 0  ; j< count[i] ; j++ )
            {
                arr[k++] = i;
            }
        }

    }
    static void display(int[] a)
    {
        for(int val: a)
        {
            System.out.println(val + " ");
        }
    }
    static void countSort(int[] arr)
    {
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i = 0 ; i<arr.length ; i++)
        {
            count[arr[i]]++;
        }
        //make prefix sum array of count array
        for(int i = 1 ; i<count.length ; i++)
        {
            count[i] += count[i-1];
        }
        /* Find the index of each element in the original array and
        put it in output array.
        */
        for(int i = n-1 ; i>= 0 ; i--)
        {
             int idx = count[arr[i] ] - 1;
             output[idx] = arr[i];
             count[arr[i]]-- ; 
        }
        //copy all elements of output to array
        for(int i = 0 ; i< n ; i++)
        {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 5 , 2 , 2 , 5};
        countSort(arr);
//    basicCountSort(arr);
        display(arr);
    }
}

