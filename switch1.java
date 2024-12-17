import java.util.Scanner;
class switch1
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int empID =sc.nextInt();
        String department =sc.next();
        switch(empID)
        {
            case 1:
                System.out.println("Kunal kushwaha");
                break;
             case 2:
            System.out.println("Rahul Rana");
             break;
             case 3:
         System.out.println("Employee number 3");
            switch(department)
                {
                  case"IT":
                 System.out.println("IT Department");
                break;
                case "Management":
             System.out.println("Management Department");
            break;
            default:
              System.out.println("No department");
              }
              break;
            default:
            System.out.println("Enter correct EmpID");
        }
    }
}