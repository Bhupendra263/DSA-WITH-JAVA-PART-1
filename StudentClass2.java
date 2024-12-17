public class StudentClass2 {
    

    public static void main(String[] args) {
         class student
    {
        // creating a new data type
         String name;
         int rollno;
         double percent;

    }
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
/* Toh ye krne se code mein kuch bhi error nhi aa rha hai i.e 
It is not a roblem . So hum
class ko humesha main function se bahar kyu bna rhe the?
 
-> Kyuki isme humari choti si problem ho jayegi -> man lijiye 
ki humein ek separate function bnana hai aur usme hume values
ko update krna hai ya class ki cheez ko access krana hai toh
hum woh cheez nhi kr payege.

Now Understand this in StudentClass3

 */