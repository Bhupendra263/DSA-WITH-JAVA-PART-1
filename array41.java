/* Given  a  matrix 'a' of dimensions nxm and 2 coordinates(l1 , r1) and (l2 , r2).
Return the sum of rectangle  (l1 , r1 ) and (l2 , r2).
Given = * l2>=l1 , r2 >= r1
      = * 0<= l1 , l2 <n n which is row
      = * 0<= r1, r2 < m m which is coloumn

      In a 2D plane if a two points are given then we can draw
      a rectangle with those points.
      Now uss rectangle ke andar jo bhi values aa rhi hai uska sum nikalna hai.
*/
import java.util.Scanner;
public class array41
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
    }
}
//This is a brute force approach - means worst appproach
