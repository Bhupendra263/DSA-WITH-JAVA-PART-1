class Array{
    void multiarray()
    {
        int[][] arr = {{56 , 43,6} , {34 , 7 , 8}};
        for(int i=0 ; i<2 ; i++)  //2 rows. we can use arr.length instead of using i
        {
            for(int j=0 ; j<3 ; j++) //2 coloumns.we can use arr[i].length instead of
                                    //using j.
            {
                System.out.print(" " + arr[i][j]);
            }
        }
    }
    void hello(){
        int []weight = {13 , 3, 5};
        for(int w : weight)
        {                               //for each loop.
                                        //agar hum for each loop use kr rhe hai.
                                        //then hum partial array print nhi kra payege.
                                        //pura array hi print hoga.
        System.out.print(" " + w);
        }
        

    }
    void hurray(){
            String [] name ={"sakshi" , "Manvi" , "Girish"}; //using while loop
            int i =0;
            while(i<3)
            {
                System.out.print(" " + name[i]);
                i =i+1;
            }
        }
    void multidimensionalArrays()
    {
       int [] ages={10 , 12, 13 ,14};
       for(int i=0 ; i<=3 ; i++)
       {
        System.out.print(" " + ages[i]);
        
       }
    }
   
    }
public class Array2{          
    public static void main(String[]args)
    {
        Array obj  = new Array();
        obj.multidimensionalArrays();
        obj.hello();
        obj.hurray();
        obj.multiarray();
    }
}