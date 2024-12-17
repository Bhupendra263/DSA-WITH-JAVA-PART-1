public class StudentClass3 {
    
   public static void fun(int x)
   {
      System.out.println(x);
      return;
   }
    public static void main(String[] args) {
        int x = 6;
        fun(x+5); //function call
    }
}
/* Toh ye krne se code mein kuch bhi error nhi aa rha hai i.e 
It is not a roblem . So hum
class ko humesha main function se bahar kyu bna rhe the?
 
-> Kyuki isme humari choti si problem ho jayegi -> man lijiye 
ki humein ek separate function bnana hai aur usme hume values
ko update krna hai ya class ki cheez ko access krana hai toh
hum woh cheez nhi kr payege.

Now Understand this in StudentClass3

Now agar hum ek function bnaye
*/