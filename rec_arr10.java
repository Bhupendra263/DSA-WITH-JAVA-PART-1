/* Given an array of integers , print sums of all subsets in  it. Output sum can be
 printed in any order.
 Input : arr[] = {2 , 3}
 Output : 0 2 3 5

 Input:arr[] = {2 , 4, 5}
 Output: 0 2 4 5 6 7 9 11 
 */
import java.util.Scanner;
public class rec_arr10 {

    static void subsetSum(int[] a , int n , int idx , int Sum)
    {

        if(idx>= n)
        {
            System.out.println(Sum);
            return;
        }
        //curr idx + sum
        subsetSum(a, n, idx+1, Sum + a[idx]);



        //curr ans
        subsetSum(a, n, idx+1, Sum);
    }
    public static void main(String[] args) {
        int[] a = {2 , 4, 5};
        subsetSum(a, a.length, 0, 0);
        
    }
}
