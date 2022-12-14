object Scala_List
{
  def main(args: Array[String]): Unit = 
 { var movie=List("Padayappa","Annamalai","Sivaji","Yenthiran","Linga","Baba")
   var movielen=List(9,9,6,9,5,4)
   println("Original list:")
   println(movie)
   var mlen= 0
   for (i<-movie)
   {  mlen+=i.length
   }
   println("The Sum of Lengths of Movies are "+ mlen)
   val movie1 = movielen.filter(_ >= 5) 
   val movie2 = movielen.filter(_ == 4)
   println(movie1)
   for(n<-movie2)  
        {  
          print(n)  
          print(" ")
        } 
   
   
   println("If First and Last Elements are same"+ movie.head == movie.last)
   
 }
 }  
   
   
   
   
   
   
   
   





        
 

