public class binarySearchproblem2 {
    public static boolean searchMatrix(int[][]a , int target)
    {
        int n = a.length;
        int m = a[0].length;
        int i = 0 , j = m-1;

        while(i<n && j>=0)
        {
            if(a[i][j]==target)
            return true;
            if(target<a[i][j])
            {
                j--; // move left.
            }
            else{
                i++; // move down.
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
        boolean found = searchMatrix(a , target);
        if (found) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }
        
    }
}
