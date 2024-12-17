
 public class passbyvalue {
    static void change(int a) {
        a = a * 100;
    System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changing value: " + a);
         change(a);
        System.out.println("After changing value: " + a);
        //before changing and after changing value dono 10 hi aya.
        //it was not multiplied by 100.
        //so aisa isliye hua kyuki jo a pass hua hai woh pass by value hua hai.
        //toh change(a) ko call krne pe waha pe ek copy bnegi aur usme 10 store hoga
        //means yaha pe koi change nhi hoga.
    }
}