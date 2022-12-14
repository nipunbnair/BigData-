object Scala_List
{
def main(args: Array[String]): Unit = 
 {
   //Iterate over a list
   val nums = List(1, 3, 5, 7, 9, 11, 14, 12)
   println("Original list:")
   println(nums)   
   println("Largest number of the said list:")
   println(nums.max)
   println("Smallest number from the said list:")
   println(nums.min)
  }
}

