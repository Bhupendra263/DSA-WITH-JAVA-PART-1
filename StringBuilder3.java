/* -> insert(idx , ch) and deleteChar(ch)
         str = "hello" -> heyllo , isme hello 5 words ka hai but
         heyllo ki length 6 hai , toh ye bhi possible hai
         StringBuilder ki help se.


         -> deleteCharAt(idx , ch)
         */
import java.util.*;
public class StringBuilder3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Sushant");
        System.out.println(str);
        str.insert(4, 'l');
        str.insert(6, 'd');
        System.out.println(str);
        str.deleteCharAt(4);
        str.deleteCharAt(5);
        System.out.println(str);

        


        
    }
}
