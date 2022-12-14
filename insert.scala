import scala.util.control.Breaks._
object Sample {

  def main(args: Array[String]) {
    var IntArray = new Array[Int](6)
    var i: Int = 0
    var j: Int = 0

    var item: Int = 0
    var flag: Int = 0

    IntArray(0) = 10;
    IntArray(1) = 20;
    IntArray(2) = 30;
    IntArray(3) = 40;
    IntArray(4) = 50;

    print("Enter Item: ")
    item = 23

    // Insert item into array.
    breakable {
      i = 0
      while (i < 6) {
        if (IntArray(i) >= item) {
          j = 4;
          while (j >= i) {
            IntArray(j + 1) = IntArray(j);
            j = j - 1;
          }
          IntArray(i) = item;
          break;
        }
        i = i + 1;
      }
    }

    i = 0;
    printf("Array Elements after insertion.\n")
    while (i < 6) {
      printf("%d ", IntArray(i));
      i = i + 1;
    }
    println();
  }
}
