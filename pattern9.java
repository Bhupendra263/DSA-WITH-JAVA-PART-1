import java.util.Scanner;
class pattern9
{
    public static void main(String[]args)
    {  int i , j;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        for( i=1 ; i<=row ; i++)//for travesring each row.
        {
            for(j=1 ; j<=col ; j++)//for traversing all the coloums.
            {
            if((i+j)%2==0)
            System.out.print("1");
            else
            System.out.print("2");
            
            }
            System.out.println("");
        }

    }
}