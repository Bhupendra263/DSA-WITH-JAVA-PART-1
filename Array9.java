import java.util.Scanner;
public class Array9
{
    static void printArray(int[] arr)
    {
        for(int i=0 ;  i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int [] arr = new int[4];
        arr[0] = 5; 
        arr[1] = 6;
        arr[2]  = 8;
        arr[3] = 9;
     System.out.println("original array");
       printArray(arr);//look how method reduces the task.
     int []arr2 = arr; //V.imp - jab bhi is tarah ki statement likhte hai toh reference.
          //ki copy bnti hai actual array ki copy nhi bnti hai.
       System.out.println("Required copied array");
      printArray(arr2);
      
       //changing some values of arr2
       arr2[0] = 0 ;
       arr2[1] = 0;
       System.out.println("Original array after changing arr2");
       printArray(arr);//original array kaise badal gya humne to arr2 mein changes kiye the.
        System.out.println("copied array after changing arr2");
       printArray(arr2); //ye toh badal gya theek hai
    }
}