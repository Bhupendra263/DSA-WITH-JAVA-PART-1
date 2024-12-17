import java.util.Scanner;
class pattern10
{
    public static void main(String[]args)
    {   
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
            System.out.print(j);
            }
            System.out.println("");//ye wali line humesha j loop ke just niche likhni hai.
        }
        
    }
}