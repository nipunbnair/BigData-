object scala_basic {  
    
   def main(args: Array[String]): Unit = {
     val nums = List(1,2,3,4,5,6,7,8,9,10)
     println("Original List")
     println(nums)
     println("Reversed the said list:")
     println("Using reverse() function:")
     println(nums.reverse)
     println("Using for loop:")
     for(n<-nums.reverse)  
        {  
          print(n)  
          print(" ")
        }  
     }
}

