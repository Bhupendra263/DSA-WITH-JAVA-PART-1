/* Follow Up Question -> A peak element is an element that is strictly
 greater than its neighbours.

 Given  a 0-indexed integer array nums , find peak element and return
 its index , if the array contains multiple peaks , return the
 index to any of the peaks.
 
 You may imagine that nums[-1] = nums[n] = -infinity . In other
 words , an element is always considered to be strictly greater
 than a neighbour that is outside the array.

 You must write an algorithm that runs in 0(log n ) time. 
 */
public class binarySearchProblem4 {
    public int findPeakElement(int[] a) {
        int n = a.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1])) {
                return mid;
            } else if (mid < n - 1 && a[mid] < a[mid + 1]) {
                // uphill/ascending
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // No peak found
        return -1;
    }

    public static void main(String[] args) {
        binarySearchProblem4 binarySearchProblem = new binarySearchProblem4();
        int[] array = {1, 3, 20, 4, 1, 0};
        int peakIndex = binarySearchProblem.findPeakElement(array);
        if (peakIndex != -1) {
            System.out.println("Peak element found at index: " + peakIndex);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
