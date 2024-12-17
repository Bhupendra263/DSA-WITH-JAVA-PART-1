/* Search the 'target' value in 2d integer matrix of dimensions
 nxm and return true if found , else return false.
 This matrix has the following properties.

 1. Integers in each row are sorted from left to right.
 2. The first integer of each row is greater than the last integer
 of the previous row.

 Input: Matrix =[[1 , 3 , 5, 7] , [10 , 11 , 16 , 20] , [23 ,30 ,34 ,60]]
 target = 3.
 Output: true. 
 */
public class binarysearchproblem1 
{
    public static boolean SearchMatrix(int[][] a , int target )
    {
        //number of rows = n , number of cols = m
        int n = a.length;
        int m = a[0].length;
        int st = 0;
        int end = n*m-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            int midElt = a[mid/m][mid%m];
            if(midElt==target)
            return true;
            if(target<midElt)
            {
                end = mid-1;
            }
            else
            {
                st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 5},
            {6, 7, 8, 9}
        };
        int target = 12;
        boolean found = SearchMatrix(a , target);
        if (found) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }
        
    }}
    