public  class Student6 {
    public static class student
    {
        // creating a new data type
         String name;
         int rollno;
         double percent;
    }
    public static void change(student s)
    {
        s.name = "Rohan";

    }
public static void main(String[] args) {
    student s1 = new student();
    s1.name = "Raghav";
    s1.rollno = 76;
    s1.percent = 92.5;
    System.out.println(s1.name);
    change(s1);
   System.out.println(s1.name); 
   //Now it is a pass by reference so Rohan will be printed. 
}}