import java.util.Scanner;
class loop6
{
    public static void main(String[]args)
    {
        int num=1;
        while(true)
        {
            if((num%5==0 )&&(num%7==0))
            {
                System.out.print("Found ans  " + num);
                break;
                //now humein sirf first multiple of 5 and7 ki value chayein.
                //toh hum break lga dege.
                //kyuki humse ek hi value puchi gyi hai.
                //agar break nhi use krege toh infinite value print ho jayegi
                //break keyword terminates the loop completely.
            }
            num++;
        }
    }
}