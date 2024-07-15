import scala.io.StdIn.readLine
object Inventory {

  def getProductList(): List[String] = {
    var products = List[String]()
    var product=""

    while (product.toLowerCase != "done") {
      product = readLine("Enter product name (type 'done' to finish): ")
      if (product.toLowerCase != "done") {
        products = products :+ product
      }
    }
    products
  }

  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val products = getProductList()
    println("Product List:")
    printProductList(products)
    println(s"Total number of products: ${getTotalProducts(products)}")
  }
}
