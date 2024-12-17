/* str.equals() and ==  */
import java.util.*;
public class String8 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2); //true.
        System.out.println(s1==s3);  
        /* False. But why ? Because it has a different address
         as we have used a new keyword to alloacate a new memory
         to it.

         Whereas in s1 and s2 they are both pointing towards a same 
         address location.

         So == operator ke hisaab ye s1 , s2 and s3 strings equal ya
        same nhi hai jbki ye galat hai teeno strings same hai
        so do not use this operator.

        So we will use str.equals() instead of == operator.

        */
      System.out.println(s1.equals(s3));
      //true.
    }
}
