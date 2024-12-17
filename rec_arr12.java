/* Given  a string containing digits from 2-9 inclusive , 
 return all possible letter combinations that the number could
 represent. Return the answere in any order.

 Input:   digits = "23".
 Output: ["ad" , "ae" , "af" ,"bd" "be" , "bf" , "cd" ,  "ce" , "cf"].
 Total Possiblities -> 3x3 for "23".
                    -> 4x3 for "78". 
*/
import java.util.Scanner;
    public class rec_arr12
    {
        static void combination(String dig , String[] kp ,String res)//"253" -> kp[2]
        {
            if(dig.length()==0)
            {
                System.out.println(res + "");
                return;
            }
            int currNum = dig.charAt(0)-'0'; //2
             String currChoices = kp[currNum]; //"abc"

             for(int i =0 ; i<currChoices.length()  ; i++)
             { //"abc"
                combination(dig.substring(1 ) , kp , res + currChoices.charAt(i));
             }
        }
        public static void main(String[] args) {
            String dig = "23";
            //kp[7] = "pqrs"
            String[] kp = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno"
              , "pqrs" , "tuv" , "wxyz"};
             //  0  1 2 3 4 5 6 7 8 9
             combination(dig, kp,  "");
        }
    }

