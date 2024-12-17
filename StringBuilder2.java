/* In String there is charAt function to get access
 of a character but there is no  function to set the character.

 str = "hello";
 str.charAt(0) = D; //This is not possible in Strings.

 -> But in String Builder we can do this using setCharAt(idx , ch)

 */
import java.util.*;
 public class StringBuilder2{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        //hello -> mello
        str.setCharAt(0, 'm');
        System.out.println(str);


        /* -> append(ch) Function. */
        str.append( " " + true);
        System.out.println(str);

      

         
    }
 }