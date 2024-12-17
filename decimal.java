//conversion of decimal to binary.
import java.util.Scanner;
class decimal
{ 
    public static void  main(String[]args)
    {    int remainder=0;
         int ans=0;
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int p=1 ;// powers of 10
         while(num!=0)
         {
         int parity=num%2;
         ans+=(parity*p);
         p*=10;    
         num=  num/2; 
         }
         System.out.println(ans);
    }}