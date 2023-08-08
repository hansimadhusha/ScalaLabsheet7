object q3 extends App{
  def filterPrime(arr: Array[Int]): Array[Int] = {
    arr.filter(arr => arr > 1 && (2 until arr).forall(i => arr % i != 0))
  }

  val arr = Array(1,2,3,4,5,6,7,8,9,10,11)
  println(filterPrime(arr).mkString(", "))

}