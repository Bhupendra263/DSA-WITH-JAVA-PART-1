/* Given an array of integers of size n.Answer q queries where you need to print the sum 
of values in a given range of indices from l to r(both included).
Note:The values of l or r in queries follow 1-based indexing 
a = {2, 4 , 1, 3, 6, 5}
pref = { 2 ,6, 7 ,10 , ,16, 21}
sum l to r = pref[r] - pref[l-1]
*/ 
import java.util.Scanner;

public class RangeQuery {
    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter " + n + " elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum = makePrefixSumArray(arr);
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l - 1];

            System.out.println("Sum: " + ans);
        }
    }
}
