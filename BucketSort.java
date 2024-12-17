/* Bucket Sort 
 -> Put all the elements in b. no. of buckets. 
 -> Sort each buckets individually.
 -> Take out all elements and join them.
 */
/*  Sort an array having numbers in range [0.0 , 1.0] and they
uniformly distributed with uniform distribution .
Write the effecient algorithm  to sort */ 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BucketSort
{
    static void bucketsort(float[] arr)
    {
       // Buckets
       int n = arr.length;
     //  int[]  a = new int[5];
     ArrayList<Float>[] buckets = new ArrayList[n];
     // create empty buckets
     for(int i = 0 ; i<n ; i++)
     {
        buckets[i] = new ArrayList<Float>();
     }
     //Add elements into our buckets.
     for(int i = 0  ; i< n ; i++)
     {
        int bucketindex = (int)  arr[i] * n; 
        buckets[bucketindex].add(arr[i]); 
     }
     // sort each bucket individually.
     for(int i = 0 ; i<buckets.length ; i++)
     {
        Collections.sort(buckets[i]);
     }
     //Merge all buckets to get final sorted array.
     int index = 0;
     for(int i = 0 ;  i<buckets.length ; i++)
     {
        ArrayList<Float> currBucket = buckets[i];
        for(int j = 0 ; j< currBucket.size() ; j++)
        {
            arr[index++] = currBucket.get(j);
        }
     }

    }
    public static void main(String[] args) {
        float[] arr = {0.5f , 0.4f , 0.3f , 0.2f , 0.1f};
        bucketsort(arr);
        for(float val : arr)
        {
            System.out.println(val + " ");
        }
    }
}