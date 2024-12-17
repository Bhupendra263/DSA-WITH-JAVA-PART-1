//Now hum nhi chahte the ki arr2 ko change krne se humara original array nhi change ho jaye
//so will use clone method
//using this both the arrays arr and arr2 will points to the different adresses.
//so this time they will not effect each other.
//clone method use krne se humein ek nya adress milta hai.
//ise kehte hai clone() method use krke deep copy bnana.
import java.util.Scanner;
public class Array11
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
     int []arr2 = arr.clone(); 
       System.out.println("Required copied array");
      printArray(arr2);
       arr2[0] = 0 ;
       arr2[1] = 0;
       System.out.println("Original array after changing arr2");
       printArray(arr);
        System.out.println("copied array after changing arr2");
       printArray(arr2); 
    }
}