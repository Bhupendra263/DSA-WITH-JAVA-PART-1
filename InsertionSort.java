/* Insertion Sort.
 Principle -> Take one element from the unsorted part , iterate 
 through the sorted part and find the correct position of this element.

 */
import java.util.Scanner;
public class InsertionSort
{
    static void insertionsort(int[] a)
    {
        int n = a.length;
        for(int i = 1; i<n ; i++)
        {
            int j =i;
            while(j>0 && a[j] < a[j-1])
            {
                //swap a[j] , a[j-1]

                int temp =a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8 , 3 , 6, 1 , 7,  5 , 4 ,2};
        insertionsort(a);
        for(int val: a)
        {
            System.out.println(val + " ");
        }
    }
}
/*Is Insertion Sort is stable ?
 NO , because hum equality pe sort krte hi nhi hai.

 -> Insertion Sort is  an Inplace algorithm.
 */
