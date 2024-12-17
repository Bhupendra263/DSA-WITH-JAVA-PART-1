/* Quick Sort Algorithm -> is also a divide and conquere 
 algorithm jusk like a merge sort. 
-> We can choose any pivot element randonmly.
-> Now put that pivot element at the right position.
-> We rearrange elements before and after pivotIndex
such that all the element before pivot element are less than pivot
element and all the elements after the pivot element should be greater
than it. 

 */
import java.util.Scanner;
public class QuickSort {
     
    static void displayArr(int[] arr)
    {
        for(int val: arr)
        {
            System.out.println(val + " ");
        }
    }
    static void swap(int[] arr , int x , int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr , int st , int end)
    {
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1 ; i<= end  ; i++)
        {
            if(arr[i] < pivot)
            cnt++;
        }
        int pivotidx = st + cnt;
        swap(arr , st , pivotidx);
        
        int i = st , j = end;
        // element lesser or equal left of pivotIdx , greater -> right side of pivotIdx.
        while(i< pivotidx && j> pivotidx)
        {
            while(arr[i] <= pivot)
            i++;
            while(arr[j] > pivot)
            j--;

            if(i< pivotidx && j > pivotidx)
            {
                swap(arr , i , j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }
    static void QuickSort(int[] arr , int st , int end)
    {
        if(st >= end) return;
        int pi = partition(arr , st , end);
        QuickSort(arr , st , pi-1);
        QuickSort(arr , pi+1 , end);
    }
    public static void main(String[] args) {
        int[] arr = {6 , 3 , 1 , 5 ,   4};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        QuickSort(arr , 0 , arr.length-1);

        System.out.println("Array after sorting");
        displayArr(arr);
    }
}
/*  Is Quick Sort Stable ?
 -> No Quick Sort is not Stable.
 */
