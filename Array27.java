/*Now in a  previous question interviewer agar khe ki app nya array jo ki ans hai woh create
mt kro , jo app ka given array hai usi ko change krke reverse krdo
basically koi nyi memory mt create kro.
This approach is known as inplace.*/
public class Array27
{
    static void printArray(int[] arr)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapInArray(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] =arr[j] ;
        arr[j] = temp;
    }
    static void reverseArray(int[] arr)
    {
        int i =0 ; int j=arr.length-1 ;
        while(i<j)//jab tak ye dono kahi mil nhi jate tab tak humein loop chalana hai.
        {
           swapInArray(arr , i , j);//ye kya krega arr mein jo bhi i and j hai use swap krdega
           i++;
           j--;
        }
    }
    public static void main(String[]args)
    {
        int [] arr = {1, 2 , 3, 4, 5 , 6};

        reverseArray(arr);
        printArray(arr);
       
}
}
