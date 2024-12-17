import java.util.Scanner;
class pattern3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//for number of rows 
        //int col=sc.nextInt();//for number of coloums
        for(int i=1 ; i<=row; i++)
        {
            for(int j=1 ; j<=i ; j++)
             System.out.print("*");
             System.out.println();//this will change line after completing one
                                  //iteration of the loop or one row.
         }
        
}}