object Question4 extends App{
    def sumOfEvenNumbers(numbers:List[Int]):Int={
        numbers.filter(_%2==0).sum
    }
    val inputList=List(1,2,3,4,5,6,7,8)
    val result=sumOfEvenNumbers(inputList)
    println(result)
}