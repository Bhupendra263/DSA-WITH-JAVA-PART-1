/* Remove all the occurences of 'a' from string s ="abcax" .
Lets first see the iterative code

String ans;
for(int i = 0  ; i<n ; i++)
{
    if(s.charAt(i) ! = 'a')
    {
        ans+ = s.charAt(i);
    }
}

Now how we do it recurively.

Bigger Problem -> f(s , idx) //idx represents the current index that is being processed.
-> It will remove all occurnce of 'a' in the string s starting from index idx.

-> Smaller/Recurive Problem -> f(s  , idx) , s.charAt(idx) = 'a'.
// current index pe agar 'a' hai then final answere will be our small ans
-> curr + f(s , idx+1) , f(s , idx+1)!='a'.
-> But agar current index pe 'a' nhi hai koi aur character hai then final answere 
mein current character bhi add hoga.

-> Self Work -> curr + f(s , idx+1) if s.charAt(idx)!='a'.

-> Base Case -> if(idx==n)
{
    return " "; //Empty String
}


 
*/
import java.util.Scanner;
public class Stringrecursion1 {
    static String removeA(String s , int idx)
    {
           //Base Case
           if(idx==s.length())
           return "";
           //Recurive Work
            String smallAns = removeA(s, idx+1);
           char currChar = s.charAt( idx);
            //Self Work
            if(currChar != 'a' && currChar != 'A')
{
    return currChar + smallAns;
}
else 
{
    return smallAns;
}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
    }
    
}
