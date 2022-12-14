object Scala_Array {   
  def test(nums: Array[Int]): Array[Int] = {
    var temp1 = 0
    var temp2 = 0
    var index_position = 0
    var index_last_pos = nums.length - 1   
    while (index_position < index_last_pos) {
    temp1 = nums(index_position)
    temp2 = nums(index_last_pos)
    nums(index_position) = temp2
    nums(index_last_pos) = temp1
    index_position += 1
    index_last_pos -= 1
     }
    nums
  }       
   def main(args: Array[String]): Unit = {
    var nums1 = Array(1789, 2035, 1899, 1456, 2013) 
    println("Orginal array:")
    for ( x <- nums1) {
       print(s"${x}, ")        
     }           
    var result1= test(nums1)
    println("\nReversed array:")
    for ( x <- result1) {
       print(s"${x}, ")        
     }     
    var nums2 = Array(1789, 2035, 1899, 1456)           
    println("\nOrginal array:")
    for ( x <- nums2) {
       print(s"${x}, ")        
     }       
    var result2= test(nums2)
    println("\nnReversed array:")
    for ( x <- result2) {
       print(s"${x}, ")   
    }
   }
}

