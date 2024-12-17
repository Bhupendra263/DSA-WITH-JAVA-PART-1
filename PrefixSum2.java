/*In this we have to perform prefix operation in the same
array*/
import java.util.Scanner;
public class PrefixSum2 {
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
        arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array:");
        printArray(arr);
        int[] pref = makePrefixSumArray(arr);
        System.out.println("Prefix Sum Array:");
        printArray(pref);
    }
}
