//Problems based on two pointer approach
//Sort an Array consisting of only 0s and 1s.
import java.util.Scanner;
class Array31
{
    static void printArray(int[] arr)
    {     int n = arr.length;
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  static void sortzeroesandines(int[] arr)
  {
    int  n = arr.length;
    int zeroes  = 0;
    //count number of zeroes
    for(int i = 0 ; i<n ; i++ )
    {
        if(arr[i] == 0)
        {
            zeroes++;
        }
    }
    for(int i = 0 ; i<n ; i++ ) /*yaha pe array do baar traverse ho rha hai means ye
                                /complexity increase kregaa so hum agle program mein try
                                krege ye problem solve krne ki*/
                                
    {
        if(i < zeroes)
        {
            arr[i] = 0 ;
        }
        else
        {
            arr[i] = 1;
        }
    }
  }

public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println(" Enter " + n + " Elements");
    for(int i = 0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Original array");
    printArray(arr);
    sortzeroesandines(arr);
    System.out.println("sorted Array :");
    printArray(arr);
}
}