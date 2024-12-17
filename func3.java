import java.util.Scanner;
class func3
{
    public static void main(String[]args)
    {
      int ans = sum2(); //calling  a function
      //as return value is integer so we will use int ans
      System.out.println(ans);
      
    }
    //return a value , so now we are going to return an integer
    //so use int instead of void
    static int sum2()  //function
    //return type is int
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int a =sc.nextInt();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        int sum =a+b;
        return sum;
      //  return basically means that the function end here means function over
      //thats why they are at the end.
        //We want to get the value of sum
       //So instead of dispalying we want to return the sum
    }
   
    
}