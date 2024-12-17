import java.util.Scanner;
class pattern4
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//for number of rows 
    
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=row+1-i ; j++) //logic row+1-i  
             System.out.print("*");
             System.out.println();//this will change line after completing one
                                  //iteration of the loop or one row.
         }
        
}}