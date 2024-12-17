/* Given an array of positive and negative integers , segregate
 them in linear time and constant space. The output should print all
 negative numbers , followed by all positive numbers. 
 Input: [19  -20  7  -4  -13  11  -5  3]
 Output: [ -20  -4  -13  -5  7   11  19  3]
 */
import java.util.Scanner;
public class sortproblem4 {
      static void display(int[] num)
      {
        for(int val: num)
        {
            System.out.println(val + " ");
        }
        System.out.println();
      }
      static void partition(int[] num)
      {
          int l = 0 , r = num.length-1 ; 
          while(l<r)
          {
            while(num[l]<0) l++;
            while(num[r] > 0) r--;
            if(l<r)
            {
                int temp = num[l];
                num[l] = num[r];
                num[r]  = temp;
                l++;
                r--;
            }
          }
      }
      public static void main(String[] args) {
        int[] num = {-13 , 20 , 7 , 0 , -4 , -13 , 11 , -5 , -13};
        partition(num);
        display(num);
      }
}
