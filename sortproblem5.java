/*Given an array of size N containing only 0s and 1s and 2s;
 sort the array in ascending order.

 Input: N=6
 arr[] = {0 2 1 2 0 0}
 Output:
 0 0 0 1 2 2 .
 This Problem is also known as Duch National Flag Algorithm.
*/
import java.util.Scanner;
public class sortproblem5 {
    static void displayArr(int[] num )
    {
        for(int i : num)
    {
        System.out.println(i + " ");
    }
    System.out.println();

    }
    static void sort012(int[] num)
    {
        int count_0 = 0 ; 
        int count_1 = 0 ; 
        int count_2 = 0 ;
        for(int j: num)
        {
            if(j==0)
            {
                count_0++;
            }
            else if (j==1){
                count_1++;
            }
            else
            {
                count_2++;
            }
        }
        int k = 0;
        while(count_0 > 0)
        {
            num[k++] = 0;
            count_0--;
        }
        while(count_1 > 0)
        {
            num[k++] = 1 ;
            count_1--;
        }
        while(count_2 > 0)
        {
            num[k++] = 2 ;
            count_2--;
        }

    }
    public static void main(String[] args) {
        int[] num2 = {2 , 2, 1 , 2, 2, 0 , 1 , 0 , 2, 0};
        sort012(num2);
        displayArr(num2);

    }
}
