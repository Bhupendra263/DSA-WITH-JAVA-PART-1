//Find the last occurence of element x in a given array
import java.util.Arrays;
import java.util.Scanner;
public class Array15
{   
    static int[]  smallestandlargestelement(int[] arr)
    {
        Arrays.sort(arr);
        int [] ans ={arr[0] , arr[arr.length-1]};
        return ans;
        
    }
    static boolean issorted(int[]arr)
    {
        boolean check = true;//initially isko true kr dete hai kyuiki khali array de diya
                             //jaye toh usko sorted hi treat krege.
       for(int i = 1 ; i<arr.length ;  i++ )
       /*
        if i =0;
        arr[0] <arr[-1] //negative number.
        agar i ki value zero hai toh array of 0 array of -1 se compare krega.
        jo ki koi index hi nhi hai.
        //so ye i 1 se start hoga.
        //kyuki jo hum check krege woh dusre element se start krege pehle se nhi.

       */
  {
      if(arr[i]<arr[i-1])
      {
        if(arr[i] < arr[i-1])
        //not sorted in increasing order.
        check = false;
        break;   //agar humein ek bhi jagah gadbad mil gyi toh hume age traverse krne
                //ki jroorat nhi hai 
      }
   }
      return check;

    }
    static int greater(int[]arr , int x)
    {
        int count =0 ; 
        for(int i =0 ; i<arr.length ; i++)
        {
            if(arr[i]>x)
            {
            count++;
            }
        }
        return count;
    }
    static int lastoccurence(int[] arr , int x)
    {
        int lastIndex = -1;
        for(int i =0 ; i<arr.length ; i++)
        {
            if(arr[i] == x)
            {
                lastIndex = i; //logic
            }
        }
        return lastIndex; //jab pura traversal ho jaye then return krege last index
        //loop ke bahar.
    }
    static int countoccurence(int[] arr , int x)
    {
        int count =0 ; 
        for(int i =0 ; i< arr.length ; i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;//return humesha for loop ke bahar likna hai , loop ke andar mt likh
        //dena jab pura array traverse kr lege uske baad return krna hai humko.
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter " + n + " elements ");
        for(int i =0 ; i<arr.length  ; i++)
        {
            arr[i] =  sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("COUNT OF  X is  " + countoccurence(arr  , x));
        System.out.println("Last occurence of X:" + lastoccurence(arr , x));
        System.out.println("Count of no. greater than X:" + greater(arr , x));
        System.out.println("Is sorted  " + issorted(arr));
        int[] ans = smallestandlargestelement(arr);
        System.out.println(ans[0]);//smallest at 1 position
        System.out.println(ans[1]);//largest 2nd position pe hai kyuki 2 hi element hai

    }
    
    
}