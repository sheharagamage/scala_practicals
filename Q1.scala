object Question1 extends App {
  def rev(s: String): String = {
    if (s.isEmpty) ""
    else rev(s.tail) + s.head
  }

  val a = "shehara"
  println(rev(a));
}
