import java.util.Scanner;
public class Stringrecursion {
    public static void main(String[] args) {
        String str = "college";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //sc.next() space ke baad read nhi krta hai.
        System.out.println(s);
        System.out.println(s.substring( 0 , 4));
       // Note: Here begin index is inclusive while end index is exclusive. 

        //Reading a Character.
        char ch = s.charAt(0);
        System.out.println(ch);
        for(int i =0 ; i<s.length() ; i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
