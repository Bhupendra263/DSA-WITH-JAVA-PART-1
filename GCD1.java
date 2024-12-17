/* Now we will see Euclids Algorithm for finding GCD
 
According to Euclids Algorithm
-> gcd(x,y) = gcd(y , x%y)
-> gcd(x, 0) = x  
-> agar ek no. zero hai x , y mein se then jo no. no zero hai whi
                   GCD ho jayega . ex -> (5, 0) -> 5
 */
import java.util.Scanner;
public class GCD1
{
    static int gcd(int x , int y)
    {
        if(y ==0)
        {
            return x ; //base case
        }
        return gcd(y , x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x , y));
    }

}