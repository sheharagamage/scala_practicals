object TestAccount {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(100.0)
    val acc2 = new Account(50.0)
    
    println(acc1) // Prints acc1 balance
    println(acc2) // Prints acc2 balance

    acc1.deposit(20)      // Deposit 20 to acc1
    acc1.withdraw(50)     // Withdraw 50 from acc1
    acc1.transfer(30, acc2) // Transfer 30 from acc1 to acc2

    println(acc1) // Prints updated acc1 balance
    println(acc2) // Prints updated acc2 balance
  }
}

class Account(private var balance: Double) {

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $$${amount}. Current balance: $$${balance}.")
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount}. Current balance: $$${balance}.")
    } else {
      println(s"Insufficient funds. Current balance: $$${balance}.")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount) 
      toAccount.deposit(amount) 
      println(s"Transferred $$${amount} to the target account.")
    } else {
      println(s"Insufficient funds for transfer. Current balance: $$${balance}.")
    }
  }

  def getBalance: Double = balance

  override def toString: String = f"Account balance: $$${balance}%.2f"
}
