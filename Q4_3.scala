import scala.io.StdIn.readLine

object Fibonacci {
  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      println(fibonacci(i))
    }
  }

  def main(args: Array[String]): Unit = {
    val n = readLine("Enter a number :" ).toInt
    printFibonacci(n)
  }
}
