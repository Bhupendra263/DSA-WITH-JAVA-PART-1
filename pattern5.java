import java.util.Scanner;
class pattern5
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//for number of rows 
    
        for(int i=row ; i>=1 ; i--) //this logic is also valid please dry run
                                     //for better understanding.
        {
            for(int j=1 ; j<=i ; j++)
             System.out.print("*");
             System.out.println();//this will change line after completing one
                                  //iteration of the loop or one row.
         }
        
}}