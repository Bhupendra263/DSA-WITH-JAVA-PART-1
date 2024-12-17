/* Method 2 : Pre-Calculating the horizontal sum of each row in the Matrix.
 
*/
import java.util.Scanner;
public class array42
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
    static void findPrefixSumMatrix(int[][]  matrix)
    {
        int r = matrix.length;
        int c = matrix.length;
        //traverse horizontally to calculate row-wise prefix sum
        for(int i = 0 ; i<r ; i++)
        {
            for(int j =1 ; j<c ; j++)
            {
                matrix[i][j] += matrix[i][j-1];
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
        
    }
}
//so second approach mein humne nested loop nhi lgaya so thoda kaam bach gya 