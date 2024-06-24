
object Main extends App {

  // Define a function to calculate the number of attendees based on the ticket price
  def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20

  // Define a function to calculate the revenue based on the ticket price
  def revenue(price: Int): Int = attendees(price) * price

  // Define a function to calculate the cost based on the ticket price
  def cost(price: Int): Int = 500 + 3 * attendees(price)

  // Define a function to calculate the profit based on the ticket price
  def profit(price: Int): Int = revenue(price) - cost(price)

  // List of ticket prices to consider
  val prices = List(5, 10, 15, 20, 25, 30, 35, 40)

  // Calculate and print profits for different ticket prices
  println("Profits for different ticket prices:")
  prices.foreach { price =>
    val profitValue = profit(price)
    println(s"Price: Rs. $price, Profit: Rs. $profitValue")
  }

  // Find the best ticket price that maximizes profit
  val bestPrice = prices.maxBy(profit)
  val maxProfit = profit(bestPrice)

  println(s"The best ticket price is Rs. $bestPrice with a profit of Rs. $maxProfit")
}
