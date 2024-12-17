public class StudentClass1 {
    public static class student
    {
        // creating a new data type
         String name;
         int rollno;
         double percent;

    }

    public static void main(String[] args) {
       student x = new student(); //declaration.
       x.name = "Raghav"; //initialization.
       x.rollno = 76;
       x.percent = 92.5;
       System.out.println(x.name);
       System.out.println(x.percent);

       student s  = new student();
       s.name = "Akshit";
       s.percent = 97.2;
       s.rollno = 34;
       System.out.println(s.name);
       System.out.println(s.percent);
       System.out.println(s.rollno);

    }
}
/* Now ab jo humne cheez bnayi hai public static class student
 ye humne main ke bahar bnaya hai , kya hum isko cut krke main ke andar likh
 skte hai ? Bilkul likh skte hai.
 */