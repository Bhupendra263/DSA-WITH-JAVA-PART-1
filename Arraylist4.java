

import java.util.ArrayList;
import java.util.Collections;
public class Arraylist4 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Orirginal list" + list);
        Collections.reverse(list);
       // reverseList(list);
        System.out.println("Reverse List" + list);
        Collections.sort(list);
        System.out.println("Ascending order" + list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Descending order" + list);
    }
}
