//Find the number of triplets whose sum is equal to the given value x
import java.util.Scanner;
class Array17
{
    static  int tripletsSum(int[] arr  , int target) //arr and target do cheeze ye recieve kr
   //rha hai.
    {
        int n = arr.length;
        int ans = 0;
        for(int i = 0 ; i< n; i++) //first number
        {
            for(int j = i +1 ; j<n ; j++)//for second number
            {
                for(int k = j+1  ; k<n ; k++) // for third number
                {
                if(arr[i] + arr[j] + arr[k] == target)
                {
                    
                  ans++;
                }
                }
      }    
  }
    return ans;  //dono loop complete ho jaye tab return krdo ans.
    }
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int [] arr = new int [n];
    System.out.println("Enter " + n + " elements");
    for(int i =0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter target sum");
    int target = sc.nextInt();
    System.out.println(tripletsSum(arr , target));
}
}