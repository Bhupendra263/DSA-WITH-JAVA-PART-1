import java.util.Scanner;
public class StringBasics3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "def";
        str = str + 10;
        System.out.println(str);
        System.out.println(str + (10+20));
        /* substring(i , j) and substring(i).
         */
        String s = "abcde";
        System.out.println(s.substring(0 , 2));
        //it will print ab
        System.out.println(s.substring(0));
        //0 se ab puri index print ho jayegi.
        System.out.println(s.substring(3));
    }
}
