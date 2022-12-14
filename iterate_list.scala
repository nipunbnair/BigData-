object Scala_List
{
def main(args: Array[String]): Unit = 
 {
   //Iterate over a list
   val nums = List(1, 3, 5, 7, 9)
   println("Iterate over a list:")
   for( i <- nums)
   {  
    println(i)
   } 
   
   println("Sum all the items of the said list:")
   //Applying sum method 
   val result = nums.sum 
   println(result) 

   println("Multiplies all the items of the said list:")
   val result1 = nums.product 
   println(result1) 
  }
} 



