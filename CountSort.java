/* Count Sort -> is a non-comparision based algorithm. 
 -> Counting Sort is generally used when range of number is already
 defined (eg - 1 to 100 )  , Lets this range be k.

 -> If range is not given in a Question then we have to traverse the 
 array and find maximum of it and thats the range of it.

 -> It is not an Inplace algorithm.(extra memory is required)

 -> arr = {4 , 3 , 1 , 5 , 3 , 1 , 3 , 5} .

 -> count_arr = { 0 , 2 , 0 , 3 , 1 , 2} .

 -> arr = {1 , 1 , 3 , 3 , 3 , 4 , 5 , 5 } .
*/
import java.util.Scanner;
public class CountSort {
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
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 5 , 2 , 2 , 5};
        basicCountSort(arr);
        display(arr);
    }
}

 