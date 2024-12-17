import java.util.Scanner;
class Array{
    void input(){
        int i;
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int [] arr = new int[n];
        System.out.println("Enter the array Elements");
        for( i =0 ; i<arr.length ; i++)
        {
            
            arr[i]=sc.nextInt();
            
        }
        //now we have to print , for this also we have to use a for loop
        for( i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i] + "  ");
        }
        //trying to copy array in arr2
        int [] arr2 = arr;
        for( i=0 ; i<arr2.length ; i++)
        {
            System.out.println(arr2[i] + "  "); //now ye for loop ka code upar likha tha
         //and humne isko fir se likha to print copied array so it is 
         //better to make a method which prints the array
         //make printArray method
        }

         
    }
}
public class Array6
{
    public static void main(String[]args)
    {
        Array obj = new Array();
        obj.input();
    }
}