/* Array 
Wrapper  Class = * a class whose objects contains  or wraps PDT(primtive data type) ex -
int , float.
* object of a wrapper class contains a field which stores PDT.

PDT  -> Wrapper class
int  ->  Integer
float ->  Float
char  ->  Character
boolean -> Boolean
long -> Long
                   
*/
import java.util.Scanner;
public class Arraylist1
{
    public static void main(String[] args)
    {
        //Wrapper classes
        Integer i = Integer.valueOf(4); //Creating a Wrapper Class.
        //Integer class hai and i object hai.
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);
    }
}
/*So what is the purpose of creating a wrapper class
basically in object oriented programming language  we use classes of java.util package
so they generally work on  objects  , not on primitive data type therefore
we create a wrapper class ex= Integer i = Integer.valueOf(4);
so here  i as an object of class Integer.
Second thing .> collections framework ke andar kuch data structures hai jaise arraylist,
stack and queue so ye jo data structures hai they also stored objects
agar hume inke andar kuch data store krana then it should not be of primitive data type 
it has  to  be objects.
*/