class Array
{ 
  void sum()
  {
    int sum=0;
    int [] arr ={1 , 2, 3, 4};
    for(int i=0 ; i<=3 ; i++)
    {
        sum += arr[i];
    }
    System.out.print(sum);
  }

}                            //iske brackets pure complete hone chahiye.
public class Array3
{
    public static void main(String[]args)
    {
        Array obj = new Array();
        obj.sum();

    }                            //aur iske pure brackets complete hone chahiye.
}
