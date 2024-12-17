//Given an array 'a' consisting of integers. Return the first value that is repeating .
//If no value is being repeated , return -1

import java.util.Scanner;
class Array21
{
    static  int repeat(int[] arr  ) 
   //rha hai.
    {
        int n = arr.length;
        int ans = 0;
        for(int i = 0 ; i< n ; i++) //first number
        {
            for(int j = i +1 ; j<n ; j++)//for second number
            {
                if(arr[i] ==arr[j]) //answere found
                {
                    
                  return arr[i]; //break se kya hota hai ki sirf ek iteration ruk jati thi
                                 //return se pura method ruk jata hai.
                                 //as hume sirf first repeated hi chahiye.
                                 //so humne return ko just baad hi likha if ke.
                  
                }
                

      }    
  }
    return -1;  //agar condition true nhi hoga toh hum loop ke bahar aa jayege and -1 return
               //kr dege.
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
    System.out.println(repeat(arr));
}
}