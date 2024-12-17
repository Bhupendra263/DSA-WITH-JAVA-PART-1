/* -> Given a string , the task is to toggle all the characters of
 the string i.e to convert Upper case to Lower case
 and vice versa.
 Input -> PhysiCS.
 Output -> pHYSics.
 */
import java.io.*;
import java.util.Scanner;
public class StringBuilder5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        // PHysiCs -> phYSIcS
        for(int i = 0 ; i<str.length() ; i++)
        {
            // check -> alphabhet -< small , capital.
            boolean flag = true; //true -> capital.
            char ch = str.charAt(i) ;
            if(ch==' ') continue;
            int asci = (int)ch;
            if(asci>=97) flag = false; //small
            if(flag==true) //capital letter
            {
                asci += 32;
                char dh = (char)asci; //a
                str.setCharAt(i, dh);

            }
            else{ //small
                asci -= 32;
                char dh = (char)asci ;
                str.setCharAt(i, dh);

            }
            
        }
        System.out.println(str);
        
    }
}
/* Follow Up Question -> Do the Same Question in Strings. */