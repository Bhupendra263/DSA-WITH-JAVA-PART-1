/* Search element in rotated sorted array with dulicate elements.
 Return true if the elements is found , else return false.

 Input: [ 0 , 0 , 0 , 1, 1 , 1 , 2 , 0 , 0 , 0]. 
 target : 2
 Output: true.
 */
import java.util.Scanner;
public class Searchinrotatedsorted3 {

    static int search(int[] a , int target)
    {
        int st = 0 , end = a.length-1;
        int ans = -1;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[st]==a[mid] && a[end] == mid)
            {
                st++;
                end--;
            }
            else if(a[mid] <= a[end])
            { // mid to end is sorted.
                if(target > a[mid] && target <= a[end])
                {
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
            else
            {
            //st to mid is sorted.
            if(target >= a[st] && target< a[mid])
            {
                end = mid-1;
            }
            else{
                st = mid+1;
            }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] a = {1 , 1 ,1,2 , 2,   3,  1};
        int target = 2;
        System.out.println(search(a, target));
        
    }
}

