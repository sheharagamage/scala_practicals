
object Main extends App {
  var i, j, k = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'

  // Evaluate expressions
  val a = k + 12 * m
  val b = m / j
  val h= n % j
  val d = m / j * j
  val e = f + 10 * 5 + g
  val fResult = {
    i += 1
    i * n
  }

  // Print the results
  println(s"a) k + 12 * m = $a")
  println(s"b) m / j = $b")
  println(s"c) n % j = $h")
  println(s"d) m / j * j = $d")
  println(s"e) f + 10 * 5 + g = $e")
  println(s"f) ++i * n = $fResult")
}
