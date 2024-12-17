/*Given a String s , print all the substrings of s.
 ->  Input: s ='abcd'.
 ->  Output: a ab abc abcd b bc bcd c cd d.
 */
import java.io.*;
public class Strings5 {
    public static void main(String[] args) {
        String str = "abcd"; // 0 to 3.
        for(int i = 0 ; i<=3 ; i++)
        {
            for(int j = i+1 ; j<=4 ; j++)
            {
                System.out.print(str.substring(i , j) + " ");
            }
        }

    }
}
