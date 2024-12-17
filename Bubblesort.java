/* 
 -> Recursion Tips  
 * Base Case with  a return Statement to avoid Stack overflow Error.
 * Recurrence Relation -> relation b/w smaller and big problem.
 * Order of Self Work and Recurive Work. 
 */
/* Bubble Sort -> 1 = In Bubble sort we do  a certain number
 of passes and in every pass , we compare adjacent elements and
 swap them if they are not in the correct order.

   example -> 5 7 4 3 1 .
   -> After Sorting = 1 3 4 5 7 .
   
   2 = In every iteration , the largest number in part of array
   to be processed gets its correct position.

   3 = No. of passes -> n-1.
   -> kyuki agar 4 numbers ko hum shi positions mein la de to 5th
   wala toh apne app hi shi position pe aa jayega.
 */
import java.util.Scanner;
public class Bubblesort{

static void bubblesort(int[] a)
{
    int n = a.length;

    //n-1 iterations or passes
    for(int i=0 ; i<n-1 ; i++)
    {
        boolean flag = false;

        for(int j = 0 ; j<n-i-1 ; j++)
        {
            /*  last i elements are already at correct sorted
            positions , so no need to check them.  */
            if(a[j] > a[j+1])
            {
                //Swap -> a[j] , a[j+1]
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                flag = true; //Some Swap has happened.
            }
        }
        if(flag ==false) //have any swaps hapened?
        { 
           return;      //if there are no swaps then it means
        //array is sorted which means we do not need to go
        //to the next value of i.
        }
    }
}


public static void main(String[] args)
{
    int[] a = {7 , 6, 5, 4, 3};
    bubblesort(a);
    for(int i : a)
    {
        System.out.println(i + " ");
    }
}}
/* Practice the basic solution and optimized solutions separately
with their Time Complexities.
*/
