class Array      //ek file ke andar multiple classes ho skti hai
{                 //and ek class ke andar multiple methods bhi ho skte hai.
    void multidimensionalArrays()
    {
        int[][] array = new int[5][3];
        int [][] arr = {{56,43,6} , {34 , 7,8} ,{12,56,8}};
        System.out.println(arr[0][0]);  //56
        System.out.println(arr[0][1]);  //43
        System.out.println(arr[0][2]);//6
        
        System.out.println(arr[1][0]);  //34
        System.out.println(arr[1][1]);  //7
        System.out.println(arr[1][2]);  //8
       
        System.out.println(arr[2][0]);  //12
        System.out.println(arr[2][1]);  //56
        System.out.println(arr[2][2]);  //8
    }
    void demoArrays()   
                        
    {
        int[] ages = new int[3];
        float[] weight = new float[3];
        ages[0]=34;
        ages[1]=12;
        //ages[5]=45; Error:Out of bounds.
        String[]names = {"rahul" , "raj" , "aradhya"};//Array literal representation
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names.length);  //3
        System.out.println(ages.length);   //3
        System.out.println(weight.length); //3

    }
}
public class Array1{            //but ek file ke andar sirf ek public class hogi
                              //aur jo bhi hum public class bnayege uska naam and 
                              //and file ka naam same hona chahiye.
    public static void main(String[]args)
    {
        Array obj  = new Array();
        obj.demoArrays();
        obj.multidimensionalArrays();
    }
}