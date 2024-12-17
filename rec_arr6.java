/* Now do not print return the ArrayList.

  arr -> 1 , 4 , 3 , 4
  target -> 4
  ans(arrayList) -> {1 , 3}
 */
import java.util.ArrayList;
import java.util.Scanner;
public class rec_arr6
{
    static ArrayList<Integer> allIndices(int[] a  , int n ,int target , int idx)
    {
        //base case
        if(idx>=n)
        {
            return new ArrayList<Integer>(); //return empty ArrayList
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        //Self Work
        if(a[idx] == target) // ans -> {0}
        {
            ans.add(idx);
        }
        //recursive Work
        ArrayList<Integer> smallAns = allIndices(a, n, target, idx+1);
        ans.addAll(smallAns);
        return ans; 
    }
    public static void main(String[] args) {
        
      int[] a = {1 , 2 , 4  , 4, 5};
      int target = 4 ; 
      int n = a.length;
      ArrayList<Integer> ans = allIndices(a, n, target, 0);
      for(Integer i: ans)
      {
        System.out.println(i);
      }
        
    }
    
}