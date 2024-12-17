public class Main{
    static void welcome()//here access specifier is not specified means it is default.
                        //static is non access modifier 
    {
        System.out.println("Welcome to Physics Wallah");
    }
    public static void main(String[]args)
    {
        welcome();       //agar hum yaha dekhe toh humne welcome method 
                        //ko directly call kr kiya without using an object of the 
                        //main class so ye static keyword ki help se hi ho paya. 
                        //agar hum  static use na kre toh hume main class ka
                        //ek object bnana pdega.
    }
}