import scala.collection.mutable
class Salesman
{
     
    // Class variables
    var name: String = ""
    var nameofcompany: String = ""
    var sales:List[Int]=List(0)
    // Class method
    def Display()
    {
        println("Name of the company : " + nameofcompany);
        println("Total number of Smartphone generation: " + name);
    }
    def Store()
    {
       name = "Rocket Singh" 
       nameofcompany = "Apple"
       sales = List(1, 3, 5, 7, 9, 1, 4, 2, 5, 4, 6, 4)
    }
    def Incentive()
    { 
     var incentive = 0.0
    for( i <- sales)
   {  
     if (i>5)
     {
        incentive = incentive + 0.05*i
     }
   } 
   println("The yearly incentive is"+incentive)
      
    }
    def Count()
    { var count = 0
      for( i <- sales)
   {  
     if (i>2)
     {
        count=count+1
     }
   } 
     println("The count is"+count)
    }
    
}
object Main
{
     
    // Main method
    def main(args: Array[String])
    {
         
        // Class object
        var obj = new Salesman();
        obj.Store();
        obj.Display();
        obj.Incentive();
        obj.Count();
        
    }
}
