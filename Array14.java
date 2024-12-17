//Count thr number of occurences of a particular element.
import java.util.Scanner;
public class Array14
{
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
    }
    
    
}