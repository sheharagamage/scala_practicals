object InventoryManagementSystem {
  var itemNames: Array[String] = Array("Apple", "Banana", "Orange")
  var itemQuantities: Array[Int] = Array(10, 5, 7)

  // Function to display the inventory
  def displayInventory(): Unit = {
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  // Function to restock an item
  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
    } else {
      println("Item does not exist.")
    }
  }

  // Function to sell an item
  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
      } else {
        println("Not enough quantity to sell.")
      }
    } else {
      println("Item does not exist.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Banana", 10)
    sellItem("Apple", 3)
    displayInventory()
  }
}