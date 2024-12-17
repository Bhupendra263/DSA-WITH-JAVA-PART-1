import java.util.Scanner;
class pattern2
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//for number of rows.
        int col =sc.nextInt();//for number of coloums. 
        for(int i=1 ; i<=row ; i++)
        { 
            for(int j=1 ; j<=col ; j++)//j ki value loop end hone ke baad fir se one.
                                       //ho jati hai.
            {
            if(i==1||j==1||i==row||j==col)
             System.out.print("*");
             else
             System.out.print(" ");//this will change line after completing one
                                  //iteration of the loop or one row.
         }
         System.out.println();
         }
        
}}