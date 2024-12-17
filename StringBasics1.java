import java.util.*;
//Star likhne se sabhi cheeze import ho jati hai.
public class StringBasics1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        //sc.next space ke baad ke characters ko read nhi krta hai.
        System.out.println(s); 
        int length = s.length();
        System.out.println(length);
        String str = "College Wallah";
        System.out.println(str);
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("l"));

        /*compareTO() ->  This function gives 0 if two strings are
        same.

        if str>gtr (lexographically) then it will give result > 0.
        (positive)

        and if str<gtr(lexographically) then it will give result<0.
        (negative)
         
        */
        String gtr = "Rishu";
        System.out.println(gtr);
        System.out.println(str.compareTo(gtr));
        /* contains() -> It returns true if the character is present
        in the string and vice versa.

        and startsWith() -> It also returns true or false
         
        . */

         String b = "Physics Wallah";
         System.out.println(b.contains("alla"));
         System.out.println(b.startsWith("Phys"));

         
    }
}
