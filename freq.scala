object Scala_List {    

  def list_elemnt_occurrences[A](list1:List[A]):Map[A, Int] = {
      list1.groupBy(el => el).map(e => (e._1, e._2.length))
    }  
  
  def main(args: Array[String]): Unit = {    
     println(list_elemnt_occurrences(List(1,1,1,2,2,3,6,4,4,6,1,6,2)))
     println(list_elemnt_occurrences(List("Red", "Green", "White", "Black", "Red", "Green", "Black")))
    }
}
