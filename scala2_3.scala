object Main extends App {
  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val normalRate = 250
    val otRate = 85
    val taxRate = 0.12
    val normalSalary = normalHours * normalRate
    val otSalary = otHours * otRate
    val grossSalary = normalSalary + otSalary
    val tax = grossSalary * taxRate
    val takeHomeSalary = grossSalary - tax 
    takeHomeSalary
  }

  
    val normalHours = 40
    val otHours = 30
    val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)
    println(f"The take-home salary is: Rs. $takeHomeSalary%.2f")
  
}