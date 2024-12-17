import java.util.Scanner;
class pattern7
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//for number of rows 
    
        for(int i=1 ; i<=row ; i++)//traversing over rows.
        {
            for(int j=1 ; j<=row-i ; j++)
            { //logic row+1-i  
             System.out.print(" ");
            }
        for(int k=1 ; k<=2* i-1 ; k++)
        {
             System.out.print("*");//this will change line after completing one
                                  //iteration of the loop or one row.
         }
        System.out.println();
}}}