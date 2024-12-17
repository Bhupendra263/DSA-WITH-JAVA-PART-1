public class StudentClass {
    public static class student
    {
        // creating a new data type
         String name;
         int rollno;
         double percent;

    }
    public static class Car {
    String name ;
    String type;
    int price;
        
    }
    public static void main(String[] args) {
       student x = new student(); //declaration.
       x.name = "Raghav"; //initialization.
       x.rollno = 76;
       x.percent = 92.5;
       System.out.println(x.name);
       System.out.println(x.percent);

       student s  = new student(); 
       // Creating new object in a same student class.
       s.name = "Akshit";
       s.percent = 97.2;
       s.rollno = 34;
       System.out.println(s.name);
       System.out.println(s.percent);
       System.out.println(s.rollno);

       Car c1 = new Car();
       c1.name = "Alto";
       c1.price = 400000;
       c1.type = "hatchback";
       System.out.println(c1.name);
       System.out.println(c1.price);
       System.out.println(c1.type);
    }
}
/* Note -> 1) OOPS refers to using objects in programming.
         -> 2) Class is user defined blueprint through which objects
         are created.
         3) Objects of same class have different properties/attribute.
         -> This Statement is wrong because objects of same class
         have same properties.
         4) Objects are instance of class.
 */