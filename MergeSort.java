/* 1 -> Divide the array into 2 equal halves.

 2 -> Sort the 2 subarrays separately using recursion(subproblem).

 3 -> Merge the 2 sorted subarrays to create an overall sorted 
 array.
  int[] arr = {7 , 20 , 4 , 11 , 8 , 2}.

  -> subarray = {7 , 20 , 4} , {11 , 8 , 2}
  // -> Sort the both subarrays recursively.
   After Sorting -> {4 , 7 , 20  } , {2 , 8 , 11}.

  -> Bigger Problem :  mergeSort(arr , l , r)
  This will solve array from l to r.

   -> mid = (l+r/2).

   -> merge sort(arr , l , r) = { merge sort(arr , l , mid) 
     // sorting first half.

 merge sort(arr , mid+1 , r)
 //sorting the second half of the array.

 // Now we have to merge these sorted subarrays 
 so we will write function for it.

 merge( arr , l , mid , r)
                                 }

   -> Now how we will merge 2 sorted subarrays to create an overall
   sorted arrays?
    left = {4 , 7 , 20}
    right = {3 , 8  , 11}
    //Now sbse smallest value array ki ya toh left array ki
    first index pe hogi ya right subarray ki first index pe hogi.    

 */
import java.util.Scanner;
public class MergeSort {


    static void displayArr(int[] arr)
    {
        for(int val :  arr)
        {
            System.out.println(val + " ");
        }
    }
    static void merge(int[]  arr , int l , int mid , int r)
    {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i , j , k;
        for( i = 0  ; i<n1 ; i++) 
        left[i] = arr[l+i];
        for( j = 0 ; j<n2 ; j++ )
        right[j] = arr[mid+1+j];
        i=0;
        j=0;
        k=l;

        while(i < n1 && j< n2)
        {
            if(left[i] < right[j])
            arr[k++] = left[i++];
            else
            arr[k++] = right[j++];
        }
        while(i<n1)
        arr[k++] = left[i++];

        while (i<n2) {
            arr[k++] = right[j++];
            
        }

    }
    static void mergeSort(int[] arr , int l , int r)
    {
        if(l>= r)
        return;
        int mid = (l+r)/2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1 , r);
        merge(arr , l  , mid  , r);
    }
    public static void main(String[] args) {
        int[] arr = {4 , 1 , 3 , 5 , 2 };
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        mergeSort(arr , 0 , n-1);
        System.out.println("Array after sorting");
        displayArr(arr);
    }
  
}

/* Q -> Is merge sort is a stable algorithm?
 Answere = Yes .

 ->  Applications of Merge Sort.

 -> Drawbacks of merge Sort.
 */
