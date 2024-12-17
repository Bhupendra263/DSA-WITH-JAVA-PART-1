import java.util.Scanner;
class pattern11
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1 ; i<=row ; i++)//to traverse each row
        {
            for(int j=1 ; j<=row-i ; j++)
            {
                System.out.print(" ");//dont forget to give space in quotes
            }
            for(int k=1 ; k<=i ; k++)
            {
                System.out.print(k);
            }
                for(int l=i-1 ; l>=1 ; l--)
                {
                    System.out.print(l);
                }
         System.out.println("");
            }
        }
    }
