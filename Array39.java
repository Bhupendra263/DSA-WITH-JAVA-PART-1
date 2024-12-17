/* Multidimensional Array(Array of Arrays) -2D Arrays.
*/
public class Array39 {
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
       int[][] arr = new int[2][3]; //intitilizationn of an array.
        int[][] arr2 ={
                      {1, 5 , 6},
                      {7 , 9 ,11} ,
                      { 2 , 5, 6}
                    };    // so this is how we are initializing a 2D array using array

           printArray(arr2);

}
    }