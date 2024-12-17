/*Now suppose humse kaha ki humein extra array use nhi krna hai means jo humne ans array
use kiya hai line 16 mein ye humne use nhi krna hai. So it means hume inplace conversion
krni hai .inplace-same array ke andar changes krke answere nikalo nya array mt bnao.
*/ import java.util.Scanner;

public class TransposeMatrix1 {     
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    static void transposeInPlace(int[][] matrix , int r , int c)
    {
      for(int i = 0  ; i<c ; i++)
      {
        for(int j = i ; j<r ; j++) // j = 0 put kro aur concept ko smjho.
        {
        //swap matrix[i][j], matrix[j][i]
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;

      }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c]; // Change variable names r1 and c1 to r and c
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Transpose of a matrix");
        transposeInPlace(matrix , r, c);
        printMatrix(matrix);
        //int[][] ans = findTranspose(matrix, r, c);
       // printMatrix(ans);
    }
}
//note: these approaches can be only used in the square matrix.
//for non-square matrix this apprpach will not work.