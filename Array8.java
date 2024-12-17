import java.util.Scanner;
public class Array8
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i =0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println( arr[i] + " ");
        }
        int []arr2 = arr; 
       System.out.println("Required copied array");
       for(int i =0 ; i<arr2.length ; i++)  //humein loop ka code fir se likhna pd gya.
     {                                     //jo ki upar likha tha.
                                           //to agge program mein hum print krege kuch arrays
                                           //so it is btter to make a method of printArray.
                                           //jo ki array print krega.
        System.out.println(  arr2[i]);
     }
    }
}