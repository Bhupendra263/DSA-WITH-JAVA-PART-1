/* Write a program to print reverse of  a string using recursion
 -> Bigger Problem - f(s , idx). //This will reverse string s starting from index idx.

 -> Smaller Problem/recursive - f(s , idx+1). //This will reverse string from idx+1 

 -> Self Work = append idx  i.e f(s , idx+1) + s.charAt(idx).

 ->Base Case - if(idx==n)
 {
    return "" ;
 }
 */
import java.util.Scanner;
public class Stringrecursion2 {

    static  String reverse(String s , int idx)
    {
        if(idx==s.length()) //Base Case
        return "" ;

        //Recursive Work
        String smallAns = reverse(s, idx+1);
        return smallAns + s.charAt(idx); // + self work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s , 0));
        
    }
}
