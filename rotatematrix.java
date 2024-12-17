/*Given a sqaure matrix , turn it by 90 degrees in a clockwise direction without using
using any extra space.
[1 , 2 , 3
 4 , 5 , 6 
 7 , 8,  9] 

 after rotation
 [ 7 , 4, 1
  8 , 5, 2
  9 , 6, 3]
*/ 
//approach = A -> A(transpose) -> Array(reverse).
import java.util.Scanner;

public class rotatematrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeInPlace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
     static void rotatematrix(int[][] matrix, int n) {
        // Transpose
        transposeInPlace(matrix, n, n);
        // Reverse each row of transposed matrix.
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();

        if (r <= 0 || c <= 0) {
            System.out.println("Invalid input for rows or columns.");
            return;
        }

        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose of a matrix:");
        transposeInPlace(matrix, r, c);
        printMatrix(matrix);

        rotatematrix(matrix, r);
        System.out.println("Rotation of matrix:");
        printMatrix(matrix);
    }
}
