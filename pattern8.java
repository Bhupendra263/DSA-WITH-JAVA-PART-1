import java.util.Scanner;
class pattern8
{
    public static void main(String[]args)
    {   int i;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for( i=1 ; i<=row ; i++) //for traversing each row
        {
            for(int j=i ; j<=row ; j++) 
            {                               //jaha se start hua hai i  waha se leke
            System.out.print(j);            //row ke end tak print krna hai
            }
         for(int k=1 ; k<=i-1 ; k++)
         {
          System.out.print(k);
         }
        //remember ek hi loop ke andar do aur loop hai .
        System.out.println();
    }
    
    }
}