/* Given a string s , return the number of palindromic substrings in it 
 Input s = "abc".
 Output: 3.

 */
import java.util.*;
public class StringBuilder6 {
    public static void main(String[] args) {
        String str = "abac";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
       String s = gtr +"";
        if(str.equals(s))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}
/* Follow Up Question -> Do the Same Question with the help
 of String.
 */