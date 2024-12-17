/* Passing class to functions:

 -> We have to declare the class outside main.
 
 -> Classes are passed by reference.
 */
public class OOPS2 {
    
    public static void change(int x)
    {
        x=7;
        return;
    }
     public static void main(String[] args) {
         int x = 6;
         System.out.println(x);
         change(x);
         System.out.println(x);

         /* Answere 6 hi ayega kyuki jaise hi main int x = 5
         ko pass kiya hai change x mein toh woh change(int x) mein
         ek naya integer form hua jo ki change nhi ho rha hai
         because this is pass by value not reference.
       */
     }
 }