/*Given Q queries , check if the given number is presented in the array or not
Note: Value of all elements in the array is less than 10 to the power 5
Ek humein array given hoga and basically humse poocha jayega ki koi element Q times is
array mein present hai ya nhi , now Q times pucha gya hai ek ya do baar nhi
so baar baar array traverse hoga , but hum chahte ki array humara ek hi baar traverse ho.i
*/
import java.util.Scanner;
public class Array30
{
  static int[] makeFrequencyarray(int[] arr)
  {
    int[] freq = new int[100005];
    for(int i = 0 ; i<arr.length ; i++)
    {
        freq[arr[i]]++;
    }
    return freq;
  }

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter array size ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println(" Enter " + n + " elements" );
    for(int i = 0 ; i<n ; i++ )
    {
        arr[i] = sc.nextInt();
    }
    int[] freq = makeFrequencyarray(arr);
    System.out.println(" Enter number of queries ");
    int q = sc.nextInt();
    while(q>0)
    {
        System.out.println(" Enter number to be searched ");
        int x = sc.nextInt();
        if(freq[x] > 0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        q--;
    }
    
}
}