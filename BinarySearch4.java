/*Find the Square rooot of the given non-negative value x.
 Round it off to the nearest floor integer value.

 Input: x =4
 Output: 2 

 Input : x = 11
 Output : 3
 */
public class BinarySearch4 {
    static int sqrt(int x)
    {
        int st = 0 , end = x;
        int ans = -1;
        while(st<= end)
        {
            int mid = st + (end-st)/2;
            int val = mid * mid; //use long here to avoid overflow.
            if(val==x)
            {
                return mid;
            }
            else if(val< x)
            {
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        int x = 24;
        System.out.println(sqrt(x));
     }
}
/* Follow Up Question -> Find the Sqaure root of a number x
 upto a given precision.
*/