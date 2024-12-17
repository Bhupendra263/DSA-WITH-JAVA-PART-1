//Find suffix-sum array.
/*suffix sum kya hota hai , suffix sum hota hai i-th index se lekar n-1 index tak sare
elements ka sum
example = a =  {2 , 1,3 ,4,5,6}
prefix sum = {2 , 3 , 6 ,10,15,21}
suffix sum ={ 21 , 19 , 18 , 15 , 11 ,6} , suffix sum piche se start hota hai.
lets understand this part
check the prefix sum of a part of the array is equal to the suffix sum of  the rest of
the array.
a = {5 , 3, 2, 6,3,1}
prefix sum = {5, 8 , 10 , 16 , 19 , 20}  5+3+2 = 10 
suffix sum  = {20 , 15 , 12 ,10 , 4 , 1} 1 +3+6 = 10
 so if(pref[i] == suff[i+1]) then return true
 else return false.


Note:humein suffix array bnane ki jroorat nhi hai hum sirf prefix array se hi apna
answere nikal skte hai.
 now let see how 
  a =  {5 , 3, 2, 6, 3, 1} -- make two subarrays (5, 3, 2) and (6 ,3 , 1)
  total sum = 20
  prefix sum = {5 , 8 , 10 } // pehle subarray ka sum 
  and if we want to find sum of second subarray then we can make suffix sum subarray
  or we can subtract the prefix sum from the total sum of the array.
   
   suffix sum = total sum - prefix sum
   then compare suffix sum == prefix sum.

  Note: In fact humein prefix sum array bnane ki bhi jroorat nhi hai , kyuki prfix sum 
  toh hum har point pe calculate kr skte hai na , we know ki jab  i = 0 hoga then 
  humara prefix sum 5 hoga and jab i = 1 hoga then hum isi prefix  sum mein 3  aur add 
  krdege so ye 8 hojayega  , when i = 2 then prefix sum = 8+2 = 10 hojayega.
  and suffix = 20-10 = 10. 
*/