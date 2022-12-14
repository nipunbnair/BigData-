import scala.collection.mutable._
object Reverse {
 def main(args:Array[String]) 
    { 
      
        // Creating stack
        val s1 = Stack(1, 2, 3, 4, 5, 6) 
          
        // Print the stack 
        println(s1) 
           
        // Applying reverse method  
        val result = s1.reverse
          
        // Display output 
        print("Reversed stack: " + result) 
           
    } 
}
