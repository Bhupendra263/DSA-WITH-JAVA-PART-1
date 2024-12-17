/*  Method 3 : Prefix Sum over coloumns and rows both.
*/
 import java.util.Scanner;
public class array43
{
    static int findsum(int[][] matrix , int l1 , int r1 , int l2 , int r2)
    {
        int sum = 0 ;
        for(int i = l1 ; i<=l2 ; i++) 
        {
            for(int j = r1 ; j<=r2 ; j++ )
            {
                sum += matrix[i][j];
            }
        }
        return sum; //first approach = brute force
    }
    static void findPrefixSumMatrix(int[][] matrix  ) {
    int r = matrix.length;
    int c = matrix[0].length; // Use the correct variable for the number of columns

    // Traverse horizontally to calculate row-wise prefix sum
    for (int i = 0; i < r; i++) {
        for (int j = 1; j < c; j++) {
            matrix[i][j] += matrix[i][j - 1];
        }
    }

    // Traverse vertically to calculate column-wise sum
    for (int j = 0; j < c; j++) {
        for (int i = 1; i < r; i++) {
            matrix[i][j] += matrix[i - 1][j];
        }
    }
}

    static int  findsum2(int[][] matrix , int l1 , int r1 , int l2 , int r2) //second approach.
    {
        int sum = 0 ; 
        findPrefixSumMatrix(matrix);
        for(int  i = l1 ; i<=l2 ; i++)
        {
            //r1 to r2 sum for row i
            if(r1>=1)
            sum += matrix[i][r2] - matrix[i][r1-1];
            else
            sum += matrix[i][r2];
        }
        return sum;
        }
        static int findsum3(int[][] matrix , int  l1 , int r1 , int l2 , int r2)//third approach
        {
            int ans = 0 ;
           findPrefixSumMatrix(matrix);
            int sum = 0;
           int up = 0  , left = 0 , leftup = 0 ;
          sum = matrix[l2][r2];
          if(r1>=r2)
          {
          left = matrix[l2][r1-1];
          }
          if(l1>=1)
          {
          up =  matrix[l1-1][r2];
          }
          if(l1>=1 && r1>=1)
          {
            leftup = matrix[l1-1][r1-1];
           
          }
          ans = sum-up-left + leftup;
            return ans;
        }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and coloumns of matrix");
        int r = sc.nextInt();
        int c  = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println(" Enter " + totalElements + " values ");
        for(int i = 0 ; i<r ; i++)
        {
            for(int j = 0 ; j<c ; j++)
            {
                matrix[i][j]  = sc.nextInt();
            }
            
        }
        System.out.println("Enter rectangle boundaries l1 , r1 , l2 , r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(" Rectangle Sum " + findsum(matrix , l1  , r1 , l2 , r2));
        System.out.println(" Rectangle Sum " + findsum2(matrix , l1  , r1 , l2 , r2));
        System.out.println(" Rectangle Sum " + findsum3(matrix , l1  , r1 , l2 , r2));

        
    }
}
//so second approach mein humne nested loop nhi lgaya so thoda kaam bach gya.
//error = all answere are not same so correct it by yourself.