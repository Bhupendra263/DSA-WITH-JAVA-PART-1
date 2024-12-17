/* Check if we can partition the array into two subarrays with equal sum.More formally,
check the prefix sum of a part of the array is equal to the suffix sum of  the rest of
the array.
a = {2 , 1 , 3 , 4, 5 , 6}
prefix sum = {2 , 3, 6, 10 , 15, 21} 
suffix sum = {21 ,19 , 18 , 15 , 11 , 6}
*/
import java.util.Scanner;
public class Array36
{
    static int findArraySum(int[] arr)
    {
        int totalsum = 0;
      for(int i = 0 ; i<arr.length ; i++ )
      {
        totalsum += arr[i];
      }
      return totalsum;
 
    }
    static boolean equalSumPartition(int[] arr)
    {
      int totalsum = findArraySum(arr);
      int prefSum = 0;
      for(int i = 0 ; i<arr.length ; i++)
      {
          prefSum += arr[i];
          int suffixSum = totalsum - prefSum;
          if(suffixSum == prefSum)
          {
            return true ; 
          }
      }
      return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter array  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter " + n + " elements ");
        for(int i = 0 ; i<n ; i++)
        {
          arr[i] = sc.nextInt();
        }
        System.out.println(" Equal partition possible:" + equalSumPartition(arr));
    }
}