/* Java StringBuilder Class.
 -> Java StringBuilder is used due to  some flaws that strings have
 in order to enhace the performance and efficiency.

 -> Strings -> interning(pointing towards same address) -> immutability
 -> poor performance. 

 Example ->
 In case of String ->
  string  str = "abc"
         str + = "xyz" 
  Toh String ke case mein "abc" ke aage "xyz" nhi judega , ek nyi
  cheez bnegi poori , pura extra time and space lgega.
  Lekin String Builder mein whi cheez aage jud jati hai.


  -> Important Constructors of StringBuilder Class

  * StringBuilder():
  * StringBuilder(String str):
  * StringBuilder(int capacity)
 */
import java.util.Scanner;
public class StringBuilder1 {
    public static void main(String[] args) {
       StringBuilder str =  new StringBuilder("hello");
       /*  str + = "world" , This type of addition is not allowed in
 a StringBuilder , it will error */
       str.append("world");
       System.out.println(str);
    }
}
