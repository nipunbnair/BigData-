object Scala_List
{
def main(args: Array[String]): Unit = 
 {
   val nums = List(1, 3, 5, 2, 7, 9, 11, 5, 2, 14, 12, 3)
   println("Original list:")
   println(nums)   
   val result1 = nums.distinct
   println("Unique elements of the said list:")
   println(result1)
   val chars = List("a", "a", "b", "c", "d", "c", "e", "f")
   println("Original list:")
   println(chars)   
   val result2 = chars.distinct
   println("Unique elements of the said list:")
   println(result2)    
  }
}

