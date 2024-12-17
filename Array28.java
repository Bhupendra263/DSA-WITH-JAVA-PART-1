//Rotate the given array by 'a' by k steps , where k is non-negative.
//Note: k can be greater than n as well.
import java.util.Scanner;
public class Array28
{
    static void printArray(int[] arr)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    static int[] rotate(int[] arr , int k)
    {
        int n = arr.length;
        k = k%n; 
        int[]  ans = new int[n];
        int j =0;
        for(int i = n-k ; i<n ; i++)
    {
            ans[j++] = arr[i];
     }
     for(int i = 0 ; i<n-k ; i++)
     {
        ans[j++] = arr[i];
     }
     return ans;

    }
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements");
    for(int i = 0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.print(" Enter k:");
    int k = sc.nextInt();
    System.out.println("Original Array");
    printArray(arr);
    int [] ans = rotate(arr , k);
    System.out.println(" Array after rotation ");
    printArray(ans);
    
}
}