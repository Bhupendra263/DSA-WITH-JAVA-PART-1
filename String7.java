import java.util.Scanner;
public class String7 {
    public static void main(String[] args) {
        String str = "";
        for(int i = 1 ; i<=10 ; i++)
        {
            str = str + i;
        }
        System.out.println(str);
    }
}

/*Note: Isme aisa nhi ho rha hai ki jo humari pehli string thi
 woh empty string thi fir usme 1 add hua , fir 2 add hua, fir 3 
 add hua -> nhi aisa nhi ho rha hai , agar aisa hua hota toh kitne
 operations lgte = 10 , lekin yaha pe ho kya rha hai
 -> " " , "1" , "12" , "123" ,  "1234" , "1234" , "12345" , "123456"
 "1234567" , "12345678" , "12345679" , "12345678910". ye cheez
 ho rhi hai.

 So yaha pe n operations nhi lg rhe n(n+1)/2 operations lg rhe thats
 why iski performance acchi nhi hoti hai.

 -> This Problem can be improved using the StringBuilder
 to enhance its performance.
 */