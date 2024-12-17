/*Given an integer array 'a' , returns the prefix sum/running sum in the same array
without creating a new array.*/
import java.util.Scanner;

public class PrefixSum {
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();