/* 
-> Immutability of Strings.
String str = "hello";
char ch = str.charAt(1);

str.charAt('D');
-> so hello will not be Dello because String are immutable
and it will not change.
But in arrays we can make changes so arrays are basically mutable
in nature.
-> We can change only directly the whole String .
 s = "Dello";

 And there is one more method that we will see in a program.
*/
import java.util.Scanner;
public class String6
{
    public static void main(String[] args) {
        String s = "Hello";
        //In string we count space also.
        s = s.substring(0,2) + 'y' + s.substring(3);
        //lekin is tarike se prformance issues kafi aa jate hai.
        /* Also in this we can only change the reference but not the
        exact string itself */
        System.out.println(s);
    }
}
/* -> Perfomance of Strings.
 -> It has  a poor Performance due to its immutability.
 -> Wastage of memory because of lots of copies.
 */