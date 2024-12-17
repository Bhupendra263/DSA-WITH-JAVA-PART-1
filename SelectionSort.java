/* Selection Sort 
 ->  It Selects an element and put it at its correct positions.
*/
import java.util.Scanner;
public class SelectionSort
{
    static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++) //i represents the current index
        {
            //Find the minimum element in unsorted part of the array
            int min_index = i;
            for(int j = i+1 ; j<n ; j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index = j;
                }
            }
            /*  swap current element and minimum element ->
    current index i will have correct element */
    //a[min_index] , a[i]
    int temp = arr[i];
    arr[i] = arr[min_index];
    arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7 , 4, 5 , 1 ,  2};
        selectionSort(arr);
        for(int i = 0 ; i<arr.length  ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        
        
    }
}
/* Q -> Is Selection Sort is Stable
 Ans -> NO.
 */