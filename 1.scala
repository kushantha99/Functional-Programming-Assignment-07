def filterEvenNumbers(inputList: List[Int]): List[Int] = {
  inputList.filter(number => number % 2 == 0)
}

val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val output = filterEvenNumbers(input)

def main(args: Array[String]): Unit = {
    println(output) 
}