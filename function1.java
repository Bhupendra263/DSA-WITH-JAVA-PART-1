//Write a java program to add two numbers using method
//Humein main method ki class alag rkhni chahiye aur hum jo baki kaam
//krte hai uske liye hum ek alag class bnayege.
import java.util.Scanner;
class Algebra //Now iss Algebra class ke andar humein ek method bnana hai jo do no.ko add krega
{
    int add(int a , int b)//is add method mein parameters de skte hai data types ke sath.
    {
    int ans = a+b;
      return ans;//if we use void return type then we dont need to return anything.
    
//how to write a method.
//access modifier, return type , method name , parameters along with data type
//yaha pe access modifier nhi define kr rhe means woh default hoga.
    }
}
public class function1{  //dont get confuse as ye toh normaly hum har program mein kr
                                
    public static void main(String[]args)//main method
    {
    //Ab Algebra class ka ek obejct bnana hai main method mein.
    Algebra obj = new Algebra();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b =  sc.nextInt();
    System.out.println("Sum of input numbers");
    obj.add(a , b); //it can be also x , y and so on. 
                   //call krne se us  method ka code execute hone lg jayega.
  int  ans = obj.add(a , b) ;
    System.out.println(ans);

    }
}