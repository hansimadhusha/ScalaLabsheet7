object q1 extends App {
  def filterEvenNumbers(arr: Array[Int]): Array[Int] = {
    arr.filter(num => num % 2 == 0)
  }

  val numbers = filterEvenNumbers(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  println(numbers.mkString(", "))

}
