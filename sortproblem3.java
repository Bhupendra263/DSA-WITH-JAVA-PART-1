/* Given an array where all its elements are sorted in increasing
 order except two swapped elements , sort it in linear time.
 Assume there are no duplicate in the array.

 Input A[] = [3 , 8 , 6 , 7 , 5 , 9 , 10]
 Output A[] = [3 , 5 , 6 , 7 , 8 , 9 , 10]
 */
 import java.util.Scanner;
 public class sortproblem3 {

    static void display(int[] num)
    {
        for(int val : num)
        {
            System.out.println(val);
        }
        System.out.println();

    }
    static void sortArr(int[]  num)
    {
        int x = -1 ; 
        int y = -1;
        int n = num.length;
        if(n<=1)
        {
            return; //corner case , edge case
        }
        //process all adjacent elements
        for(int i = 1  ; i<n ; i++)
        {
            if(num[i-1] > num[i])
            {
                if(x==-1)
                {
                    x = i-1;
                    y= i ;

                }
                else{
                    // 2nd conflict
                    y=i;

                }
            }
        }
        //Swap x , y in num
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }
    public static void main(String[] args) {
        int[] num = {10 , 5 , 6 , 7 , 8 , 9 , 3};
         sortArr(num);
         display(num);
    }
}
