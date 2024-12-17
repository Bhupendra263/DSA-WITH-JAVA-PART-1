import java.util.ArrayList;
public class Arraylist3
{
    static void reverseList(ArrayList<Integer> list)/* It is method which
    is recieving the Arraylist of integers*/
    {
        int i = 0 , j = list.size() - 1;
        while(i<j)
        {
            /*
             int temp = a ; 
             a = b; 
             b = temp;
             */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i , list.get(j));
            list.set(j , temp);
            i++;
            j--;
        }

    }
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
        reverseList(list);
        System.out.println("Reverse List" + list);
    }
}


