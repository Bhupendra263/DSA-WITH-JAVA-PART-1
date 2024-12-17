/* WAP to reverse each word in a String
 -> Input - I am an educator.
 -> Output - I ma na rotacude.
 */
import java.io.*;
public class  StringBuider7 {
    public static void main(String[] args) {
        String str = " I am an online educator "; /* educator
        ke baad space agar nhi lgayege toh educator ka reverse
        print nhi hoga.
        Understand it conceptually later.
        */
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                sb.append(ch);

            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb.delete( 0 , sb.length());
                sb = new StringBuilder("");
            }
        }
        System.out.println(ans);
    }
}
