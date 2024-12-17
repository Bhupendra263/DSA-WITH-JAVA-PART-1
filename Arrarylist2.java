import java.util.ArrayList;
import java.util.Scanner;
public class Arrarylist2 {

    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<Integer>(); /* Array is list 
        we dont need to pass size.
        Now arraylist toh bna li  now iske andar hum koi nya element add kaise kre*/
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        //add new element

        /*Now how we will acess the element */
        System.out.println(l1.get(0));

        //print with for loop 
        for(int i = 0 ; i<l1.size(); i++);
        System.out.println(l1.get(1)); // 5, 6 ,  7 , 8
        //Now hum  is arraylist ko bina loop lgaye print kr skte hai
        System.out.println(l1); //[5 , 6 , 7 ,8]

        //adding element at some index i //[5 100 6 7 8]
        l1.add(1 , 100 );
        System.out.println(l1);

        //modifying element at index i
        l1.set(1 , 10);
        System.out.println(l1);

        //Remove an element at index i
        l1.remove(Integer.valueOf(7)) ;
        System.out.println(l1);
        /*Now ye method l1.remove generally ek boolean return krta hai
        agar hum isko print krane lg jaye toh generally true and false return hoga
        */
        System.out.println(l1.remove(Integer.valueOf(7)));
        /*so now ye false return krega kyuki jo element hum remove krna chahte
        now ab woh l1 mein hai hi nhi*/
        System.out.println(l1.remove(Integer.valueOf(6)));
        /*now it will  return true */
        
        //Checking if an element exist
        boolean ans = l1.contains((Integer.valueOf(5)));
        System.out.println(ans);

        /*if you don't specify class , you can put anything inside list
         means agar hum wrapper class specify  na kre then hum is list mein kuch bhi
         daal skte hai. 
         */
        ArrayList l = new ArrayList();
        l.add("parrot");
        l1.add(1);
        l.add(true);
        System.out.println(l);
    }
}

/*Array list basically array ki tarah hi hai bss array ki limitations 
 ko ye overcome krti hai , generally it comes with the more functionality.
  
 limitations = int [] arr =  new int[5];
 so when we declare an array then after declaring it we  cannot change the size of 
 the array throughout the program. It will be only 5 which is not convenient 
 as we might need the extra space to add or delete  new elements.
 But in Arraylist we can change the size of the array.
  */
  