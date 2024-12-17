/* 1 -> Public - all packages.
   2 -> Private - same class.
   3 -> Default -> same package.

   -> The above are the keywords which represents the access modifier.

   -> Private = means agar main kisi bhi attribute mein jo ki
   class ke andar present hai usme agar private  keyword lga du
   toh uss cheez ko kahi hum aur access nhi kr skte hai.
 */
public class OOPS5
{
    public static void change(student s)
    {
        s.name = "Rohan";
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "raghav";
        s1.percent = 92.1 ;
        private s1.rollno = 3; // So yaha pe error ayega

        /* Kyuki jo humne student class bnayi thi
          waha roll no. ko private int roll.no kr diya isliye
          so now woh sirf within the braces hi accessible hoga
          uske bahar nhi.

         ->  Use of Private key : Manlo hum project bna rhe hai 
         industry mein and hum chahte hai ki ek particular cheez
         koi aur appka project mein use krke change na kr paye , 
         baki sari cheeze modify ho sake but kuch particular cheeze
         access na ho so we will use this approach.
         */
    }
}