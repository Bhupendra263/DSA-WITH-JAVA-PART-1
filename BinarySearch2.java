/* Implementation of Binary Search using recursion. */
public class BinarySearch2 {
    static boolean recursivebinarySearch(int[] a, int st , int end , int target)
    {
        if(st>end) return false; //base case
        int mid = (st+end)/2;
        if(target == a[mid])
        {
            return true;
        }
        else if(target<a[mid])
        {
            return recursivebinarySearch(a, st,  mid-1, target);
            //subproblem.
        }
        else
        {
           return recursivebinarySearch(a, mid+1, end, target); 
            //subproblem.
        }
    }
    public static void main(String[] args) {
        int[] a = {1 , 2 , 3 , 4 , 5};
        int target = 0;
       System.out.println(recursivebinarySearch(a, 0, a.length-1 , target));
       target++;
    }
}
