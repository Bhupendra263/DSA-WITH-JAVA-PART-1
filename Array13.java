import java.util.Arrays;
import java.util.Scanner;
public class Array13
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
       printArray(arr);
     int []arr2 = Arrays.copyOfRange(arr , 1 , 4);//copyrange do parameter mangta hai
      //pehla ye ki kis array ki copy bnani hai and dusra ki kaha se aur kaha tak copy
      //krna hai. here 1st index is included but 4th index is not.
       System.out.println("Required copied array");
      printArray(arr2);
    //    arr2[0] = 0 ;
    //    arr2[1] = 0;
    //    System.out.println("Original array after changing arr2");//original mein koi change. 
    //                                                           // nhi hoga.
    //    printArray(arr);
    //     System.out.println("copied array after changing arr2");
    //    printArray(arr2); 
     }
}