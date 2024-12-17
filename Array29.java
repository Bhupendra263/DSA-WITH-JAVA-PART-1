/*Rotate the given array 'a' by k steps , where k is non-negative without using extra space
means this time don't use an ans array means humein Inplace ka concept use krna hai.
note:k can be greater than n as well */

import java.util.Scanner;
public class Array29
{
    static void printArray(int[] arr)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr , int i , int j)
    {
        while(i<j)
        {
            swap(arr , i ,  j);
            i++;
            j--;
        }
    }
    static void rotateInplace(int[] arr , int k)
    {
        int n = arr.length;
        k = k%n;
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr , 0 , n-1);
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
    rotateInplace(arr , k);
    System.out.println(" Array after rotation ");
    printArray(arr);
    
}
}