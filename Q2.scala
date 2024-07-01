object Question2 extends App {
  def filterLongString(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  val inputList = List("Phone", "Computer", "Laptop", "Router", "Tablet")
  val result = filterLongString(inputList)
  println(result)
}
