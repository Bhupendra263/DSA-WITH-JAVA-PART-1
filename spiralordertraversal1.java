/* Given a positive integer n , generate an nxn matrix filled with elements from 1 to n^2 
in spiral order.
*/
import java.util.Scanner;
public class spiralordertraversal1
{
    static void printMatrix(int[][] matrix)
    {
        for(int i = 0 ; i<matrix.length ; i++ )
    {
        for(int j = 0 ; j<matrix[i].length ; j++)
        {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
        
    }

static int[][] printspiralorder(int n ) /*matrix to ye recieve hi nhi krega kyuki woh toh hume banana hai*/                                      
{
    int [][] matrix =  new int[n][n];
    int topRow  = 0  ; int bottomRow = n-1 ; int leftCol = 0 ;int  rightCol = n-1;
    int curr = 1 ; 
    while(curr < n*n)
    {
        //topRow -> leftCol to rightCol.
        for(int j = leftCol ; j<=rightCol && curr < n*n; j++)
        {
            matrix[topRow][j] = curr++;
            
        }
        topRow++;
        //rightCol -> topRow to BottomRow.
        for(int i = topRow ; i<=bottomRow &&  curr < n*n ; i++)
        {
           matrix[i][rightCol] = curr++;
        }
        rightCol--;
        //bottomrow -> rightCol to leftcol.
        for(int j = rightCol ; j>=leftCol &&  curr < n*n; j--)
        {
            matrix[bottomRow][j] = curr++;
           
        }
        bottomRow--;
        //leftCol -> bottomRow to topRow.
        for(int i = bottomRow ; i>=topRow && curr < n*n ; i--)
        {
        matrix[i][leftCol] = curr++;
        }
        leftCol++;
    }
    return matrix;

}
public static void  main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows and colomns of matrix");
    int n = sc.nextInt();
    int[][] matrix = printspiralorder(n);
    printMatrix(matrix);
    
}}