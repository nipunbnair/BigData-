class Student{

	var name:String=null;
	var marks=new Array[Int](5);
	def store(n:String, m:Array[Int]):Unit=
	{
		name=n;
		marks=m;
	}
	def average(): Float=
	{
		marks.sum/(marks.length)
	}
	def largest(): Int=
	{
		marks.max
	}
}
object Student1{
	def main(args:Array[String]): Unit=
	{
	val s1 = new Student()
	s1.store("Arun",Array(56,57,96,80,77))
	println(s1.average())
	println(s1.largest())
	}
}
