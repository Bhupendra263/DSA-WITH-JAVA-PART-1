/* Multidimensional Array(Array of Arrays) -2D Arrays.
*/
import java.util.Scanner;
public class Array40 {
    static void printArray(int[][] arr){
        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int  j = 0 ; j< arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
        
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of coloumns");
        int c = sc.nextInt();
        System.out.println("Enter the elements of array");
       int[][] arr = new int[r][c]; /*intitilizationn of an array , total elements = r*c
       yaha no. of rows dena compulsoryy hota hai but coloums dena necessary nhi hota hai*/
       for(int i = 0  ; i<r ; i++)
       {     
        for(int j = 0  ; j<arr[i].length ; j++)
        {
            arr[i][j] = sc.nextInt(); //input from the user
        }

       }

        
           printArray(arr);

}
    }