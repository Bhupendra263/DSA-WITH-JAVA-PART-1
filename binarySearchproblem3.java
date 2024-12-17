/* Given a mountain array 'a' of length greater than 3 , return
 the index 'i' such that arr[0]<arr[1]<...<arr[i-1]<arr[i]>arr[i+1]>..>
 arr[arr.length-1]. This index is known as the peak index.
 Input: Array = [0 , 4 , 1 , 0].
 Output: 1.
 */

 public class binarySearchproblem3 {

    public int peakIndexMountainArray(int[] a) {
        int st = 0, end = a.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid > 0 && a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                ans = mid;
                break;
            } else if (a[mid] < a[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        binarySearchproblem3 binarySearchProblem = new binarySearchproblem3();
        int[] mountainArray = {1, 3, 5, 7, 10, 8, 6, 4, 2};
        int peakIndex = binarySearchProblem.peakIndexMountainArray(mountainArray);
        if (peakIndex != -1) {
            System.out.println("Peak index of the mountain array: " + peakIndex);
        } else {
            System.out.println("Mountain array is invalid or not found.");
        }
    }
}
