public class StudentClass5 {
    public static class student
    {
        // creating a new data type
         String name;
         int rollno;
         double percent;

    }
    
    public static void fun(student x)
    /*  So yaha pe error aa rha hai kyuki isko pta hi nhi hai ki
    ye student koi data type hai yaha nhi because main function
    mein jo student hai woh sirf usi ke scope ke andar hi hai.
 
    Lekin agar hum class student ko main se hta kar yahi bna du
     toh uske baad hum jo bhi krege so usme koi problem
     nhi ayegi.
  */
    {
     System.out.println(x.name);
    }
     public static void main(String[] args) {
        student x = new student(); //declaration.
        x.name = "Raghav"; //initialization.
        x.rollno = 76;
        x.percent = 92.5;
        fun(x);
       // System.out.println(x.name);
        // System.out.println(x.percent);
 
        /* Now agar main chahta hu ki main student ka name
         and percent print kru lekin sout likhe na print kru
         balki main print kru function ke through
         */
 

         /* Now we have understood that why we create a class
          outside the main function.
          */
     }
 }