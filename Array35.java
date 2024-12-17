//Prefix sum approach
/*Given an integer array 'a' , returns the prefix sum/running sum in the same array
without creating a new array
lets first understand what is prefix sum or running sum 
 a = {2, 1, 3, 4 ,5}
 suppose humne bola 2nd index p prefix sum kya hoga 
 toh woh hoga starting se lekar us index tak ka sum means 6
 similarly for 3rd index it is 10
 pref = { 2, 3 , 6 , 10, 15}
pref[0] = a[0];
pref[1] = a[0] + a[1];
pref[2] = a[0] + a[1] + a[2];
pref[3] = a[0] +a[1] + a[2] + a[3];
pref[3] = pref[2] + a[3];
pref[4] = a[0] +a[1] + a[2] + a[3] + a[4];
 or pref[4] = pref[3] + a[4]
 for any i>=1
 formula --- pref[i] = pref[i-1] + a[i];
*/

