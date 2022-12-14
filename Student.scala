import scala.collection.mutable
class Student
{
     
    // Class variables
    var name: String = ""
    var registration_no: String = ""
    var marks:List[Int]=List(0)
    // Class method
    def Display()
    {
        println("Registration Number : " + registration_no);
        println("Name: " + name);
    }
    def Store()
    {
       name = "Rocket Singh" 
       registration_no = "BLENU4AIE20044"
       marks = List(91, 93, 95, 97, 99, 91, 94, 92)
    }
    def AverageMax()
    { 
     var average = 0.0
     average = marks.sum/marks.length
     println("The average is "+average)
     var max= marks.max
     println("The max marks is "+max)
    }
    
    
}
object Main
{
     
    // Main method
    def main(args: Array[String])
    {
         
        // Class object
        var obj = new Student();
        obj.Store();
        obj.Display();
        obj.AverageMax();
        
        
    }
}
