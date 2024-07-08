object StringFormatter {
  // Method to convert a string to upper case
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  // Method to convert a string to lower case
  def toLower(name: String): String = {
    name.toLowerCase
  }

  // Method to apply a given format function to a string
  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    // Test inputs
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Applying format functions to the test inputs
    println(formatNames(names(0))(toUpper))     // BENNY
    println(formatNames(names(1))(name => name.substring(0, 2).toUpperCase + name.substring(2))) // NIroshan
    println(formatNames(names(2))(toLower))     // saman
    println(formatNames(names(3))(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase)) // KumarA
  }
}