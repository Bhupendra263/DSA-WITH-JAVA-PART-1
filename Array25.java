//Given 2 integers a and b . Swap the 2 given values using sum and difference method
public class Array25
{
    static void swap(int a , int b)
    {
      System.out.println("Original values before swap");
      System.out.println("a:" + a);
       System.out.println("b:" + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("values after swapping");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    
    }
    public static void main(String[]args)
    {
        int a = 9; 
        int b = 3;
        int[] arr ={1,2,3,4,5};
        swap(a , b);
}
}