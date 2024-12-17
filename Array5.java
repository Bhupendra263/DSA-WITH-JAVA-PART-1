//Taking input in an array
import java.util.Scanner;
class Array{
    void input(){
        int i;
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int [] arr = new int[n];
        System.out.println("Enter the array Elements");
        for( i =0 ; i<arr.length ; i++) //0 se length tak hume input chahiye.
        {
            
            arr[i]=sc.nextInt();
            
        }
        //now we have to print , for this also we have to use a for loop
        for( i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + "  ");
        }

         
    }
}
public class Array5
{
    public static void main(String[]args)
    {
        Array obj = new Array();
        obj.input();
    }
}