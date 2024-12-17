/*Given an integer n , return the first n rows of Pascal's triangle.
In Pascals triangle , each number is the sum of the two numbers directly aboye it.
 pascals triangle ki    har ek row mein pehla element and last element humesha 1 hota hai
 
 *  = p[i][j] = p[i-1][j] + p[i- 1][j-1]
 * = in every row first and last element is 1.
 * this is a jagged array means har ek row mein jroori mhi hai same no. of coloumns ho.
 * ith row hai (i+1) coloumns.
 
 */
 import java.util.Scanner;
 public class pascaltriangle
 {
    static void printMatrix(int[][] matrix)
    {
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[i].length ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n)
    {
        int[][] ans =  new int[n][];
        for(int i =0 ; i< n ; i++)
        {
            //ith row has i+1 coloumns
            /*
            ans[0] = new int[1]
            ans[1] = new int[2]
            */
            ans[i] = new int[i+1]; //dynamically getting the spaces for coloumns.
            //1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;
            for(int j = 1 ; j<i ; j++)
            {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
        
   }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);
    }
 }