object InventorySystem {

  def main(args: Array[String]): Unit = {
    // Sample inventories
    val inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 10, 20.0),
      102 -> ("ProductB", 5, 30.0),
      103 -> ("ProductC", 15, 10.0)
    )

    val inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 8, 25.0),
      104 -> ("ProductD", 20, 15.0)
    )

    // I. Retrieve all product names from inventory1
    val productNames = getProductNames(inventory1)
    println("Product Names in Inventory1: " + productNames.mkString(", "))

    // II. Calculate the total value of all products in inventory1
    val totalValue = getTotalValue(inventory1)
    println("Total Value of Inventory1: " + totalValue)

    // III. Check if inventory1 is empty
    val isEmpty = checkIfEmpty(inventory1)
    println("Is Inventory1 Empty? " + isEmpty)

    // IV. Merge inventory1 and inventory2
    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("Merged Inventory: " + mergedInventory)

    // V. Check if a product with a specific ID (e.g., 102) exists and print its details
    val productIdToCheck = 102
    checkAndPrintProductDetails(inventory1, productIdToCheck)
  }

  // I. Retrieve all product names from inventory1
  def getProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
    inventory.values.map(_._1).toList
  }

  // II. Calculate the total value of all products in inventory1
  def getTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }

  // III. Check if inventory1 is empty
  def checkIfEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
    inventory.isEmpty
  }

  // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price
  def mergeInventories(
    inventory1: Map[Int, (String, Int, Double)],
    inventory2: Map[Int, (String, Int, Double)]
  ): Map[Int, (String, Int, Double)] = {
    inventory2.foldLeft(inventory1) {
      case (merged, (id, (name, quantity, price))) =>
        merged.get(id) match {
          case Some((existingName, existingQuantity, existingPrice)) =>
            merged.updated(id, (existingName, existingQuantity + quantity, math.max(existingPrice, price)))
          case None =>
            merged + (id -> (name, quantity, price))
        }
    }
  }

  // V. Check if a product with a specific ID (e.g., 102) exists and print its details
  def checkAndPrintProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"Product with ID $productId does not exist.")
    }
  }
}
