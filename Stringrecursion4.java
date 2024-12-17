/* Do the same palindrome program without using the reverse method. 
 -> Bigger Poblem -> f(s , l , r)
 -> Is string s between indices l and r is palindrome? 

 Subroblem = f(s , l+1 , r-1) //check kr rhe ki l and r ke beech wali string
 palindrome hai ya nhi

 -> Self Work = if(s.charAt(l)== s.charAt(r))

 -> Base Case =  if(l>=r)
               {
                return true
               }
*/
import java.util.Scanner;
public class Stringrecursion4
{
    static boolean isPalindrome(String s , int l , int r)
    {
          if(l>=r)
          return true;
          return (s.charAt(l)==s.charAt(r) && isPalindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }

}