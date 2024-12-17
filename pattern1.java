import java.util.Scanner;
class pattern1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//for number of rows 
        int m =sc.nextInt();//for number of coloums
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=m ; j++)
             System.out.print("*");
             System.out.println();//this will change line after completing one
                                  //iteration of the loop or one row.
         }
        
}}