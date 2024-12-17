/* No. 1 reason for studying oops is user defined data types.
 Till now we have seen the data types like int , float , double,char
 , String and these data types are generally used to store data
 efficiently.

 Now suppose we a class Student which has a 50 students and har ek student
 jo usme hai unme kuch na kuch koi commom cheez jroor hogi jaise
 sbka ek roll no. hoga ,  percentage hoga aur name hoga so
 hum dekh skte hai in 50 students mein kuch common properties hai.


 similary take a class car so it will include diffrent type of 
 cars such as mercedes Benz , lamborghini , scorpio , bolero etc.

 Now if we look on class Students ->

 -> 50 students 
  1 = Name -> String arr[50] will be used for storing the names.
  2 = Roll No. -> int a[50] will be used for storing the roll no.
  3 = Percentage -> double array[50] will be used for storing the
        percentage.

 But hume 3 separate array bnane pde aur ye apas
 mein linked nhi hai ek dusre se , aise cases mein humara class
 kaam aata hai.


 Imp -> Now we will see class creation and know that how this can be used to resolve
 above problem.
 
 Object Creation in OOPS ->
  class Name object name = new class Name();

  * For example -> Student s1 = new Student();

 */