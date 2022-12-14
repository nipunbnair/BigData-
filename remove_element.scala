object Scala_Array
{
  def main(args: Array[String]): Unit = 
 {
   val colors = Array("Red","Blue","Black","Green","White")
   println("Original Array elements:")
   // Print all the array elements
      for ( x <- colors ) {
         print(s"${x}, ")        
       }
     println("\nReplace some elements with ''/null etc.:")
      colors(0) = ""
      colors(3) = null
   println("Now the Original Array becomes:")
   // Print all the array elements
      for ( x <- colors ) {
         print(s"${x}, ")        
       }
  }
}

