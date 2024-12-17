/*Write  a program to check given string is palindrome or not. */
import java.util.Scanner;
public class Stringrecursion3 {

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
        String rev = reverse(s, 0);
        if(rev.equals(s))
        {
           System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}
