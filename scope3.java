//Same thing happens in a loop
//if we write int i within a for loop and print it outside the block it
//will not get printed
//for example
//for(int i  , i<=n ; i++)

//   {
     //scope of i is valid only within it.
//   }
//   System.out.print(i);
//it gives an error
//but you declare it  just after main method then it will not give any error.


//Note:Do scope ke andar same variable use kr skte hai because they can be treated 
//as different 
//Example-
//for(int i  , i<=n ; i++)

//   {
     //System.out.print(i)
//   }
//for(int i  , i<=5; i++)

//   {
     //System.out.print(i)
//   }

//loop variable have block level scope.
//both the loops will print differnt values.