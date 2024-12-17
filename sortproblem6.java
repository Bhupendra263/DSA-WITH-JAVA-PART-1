/* Same problem but this time we will use only one pass. */
import java.util.Scanner;
public class sortproblem6
{
    static void display(int[] num)
    {  
        for(int i : num)
    {
        System.out.println(i + " ");
    }
    System.out.println();

    }
        static void swap(int[] a , int x , int y)
{
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
}
static void sort012(int[] a)
{
    int lo = 0 , mid = 0 , hi = a.length-1;

    //explore the unknown region.
    while(mid<= hi)
    {
        if(a[mid]==0)
        {
          swap(a , mid , lo);
          mid++;
          lo++;
        }
        else if(a[mid]==1)
        {
            mid++;
        }
        else
        {
            swap(a , mid , hi);
            hi--;
        }
    }

}
    public static void main(String[] args) {
        int [] num = {2 , 2 , 0 , 0 , 1 , 2 , 0 , 1, 0};
        sort012(num);
        display(num);
    }
}
