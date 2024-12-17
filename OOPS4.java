
/* 
Default values :
 
 */
public  class OOPS4{
    public static class student
    {
        // creating a new data type
         String name;
         int rollno;
         double percent;
    }
public static void main(String[] args) {
    student s1 = new student();
    System.out.println(s1.name); //null
    System.out.println(s1.rollno); //0
    /*  So agar humne initialize na bhi kiya ho
     sirf humne object create kr diya toh bhi koi error
     nhi ayegi and is case mein humara default value print hoga.
     and That is called the Default values.

      */
    
}}
