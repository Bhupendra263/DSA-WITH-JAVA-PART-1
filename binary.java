//Binary to decimal program
import java.util.Scanner;
class binary
{ 
    public static void  main(String[]args)
    {    int remainder=0;
         int ans=0;
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int p=1 ; //2^0=1 power of 2
         while(num!=0)
         {
         remainder = num%10;//extracting each digit
         ans=ans+(remainder*p);//1001 =1*1 , 0*2 , 0*4..
          num=  num/10;
          p=p*2;// 1*2=2, 2*2=4, 4*2=8... 
          
         }
         System.out.println(ans);
         
        
    }
    
}