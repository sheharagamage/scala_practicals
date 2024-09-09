object Q1 {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1)

    def neg: Rational = new Rational(-numer, denom)

    override def toString: String = s"$numer/$denom"

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def subtract(r: Rational) = new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
  }

  // main method to test the Rational class
  def main(args: Array[String]): Unit = {
    val r1 = new Rational(3, 4)
    val r2 = new Rational(5, 6)
    val result = r1.subtract(r2)
    println(s"Subtraction of $r1 and $r2 gives: $result")
  }
}
