object Scala_List
{
  def main(args: Array[String]): Unit = 
 {
   val nums = List(1, 3, 5, 7, 9, 11, 14, 12)
   println("Original list:")
   println(nums)   
  //As scala List is immutable, so we can’t delete elements from it, but
  //filter out element(s) as per requirement.
   println("Filter out 3 from the above list:")
   val nums1 = nums.filter(_ != 3) 
   println(nums1)
   println("Filter out numbers which are greater than 10:")
   val nums2 = nums.filter(_ > 10) 
   println(nums2)   
  }
}


