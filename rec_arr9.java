/* Given a string , write a method to print all its subsequences. */
import java.util.Scanner;
public class rec_arr9
{
    static void printSSQ(String s , String currentAns) //s = "abc"
    {
        if(s.length()==0)
        {
            System.out.println(currentAns);
            return;
        }
     char curr = s.charAt(0);
     String remString = s.substring(1); //bc

     //curr char -> choose to be a part of current answere.
     printSSQ(remString ,  currentAns + curr); //bc , a 


     //curr char -> does not choose to be a part of current char.
    printSSQ(remString, currentAns); //bc , ""
    }    
    public static void main(String[] args) {
        printSSQ( "abc" , "");
    }
}  

