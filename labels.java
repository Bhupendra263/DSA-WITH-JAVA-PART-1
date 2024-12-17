import java.util.Scanner;
class labels
{
    public static void main(String[]args)
    {
    
       myloop: for(int num=1 ; num<=50 ; num++)
        {
            if(num%3==0)
            {
                continue myloop;//agar aisa hai toh mt print kro age bdh jao.
                         //so multiple of 3 print nhi hoge.
            }
            System.out.println(num);
            System.out.println();
        }
    
}
}
//EK scope ke andar do variable ke naam same nhi ho skte.