object Q2 {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val totalLetterCount = wordLengths.reduce(_ + _)
    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val words = List("Scala", "is", "fun")
    val totalLetters = countLetterOccurrences(words)
    println(s"Total number of letters: $totalLetters")
  }
}
