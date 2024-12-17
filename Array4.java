//calculate the maximum value in the array
//Search the given element x in the array .If prsent then return the index else return -1.
class Array{
    void search()
    {    int ans =-1;
        int []arr= {1,3,4,5,3,6};  //arr -differnt scope
        int x=3;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==x)
            {
            ans=i;
            break; //as we want to get only the first occurence.
                   //if not used it will give index 4.
            }
        }
        System.out.print("Found " + x + " at index " + ans);
    }
    void max()
    {    
        int []arr = {12 , 15, 24 ,13 ,45};
        {    int ans=0;
            for(int i=0 ; i<arr.length ; i++)
            {
                if(arr[i]>ans)
                {
                    ans=arr[i];
                }
                
            }
            System.out.println("Max  " + ans);
        }
    }
}
public class Array4
{
    public static void main(String[]args)
    {
        Array obj = new Array();
        obj.max();
        obj.search();
    }
}