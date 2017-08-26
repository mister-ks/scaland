
object Fizzbuzz {
  def main(args: Array[String]) {
    var num = 1
    for (num <- 1 to 1000)
    if (num % 15 == 0) {
      println("fizzbuzz")
    } else if (num % 3 == 0) {
      println("buzz")
    } else if (num % 5 == 0) {
      println("fizz")
    } else {
      println(num)
    }
    num = num + 1
  }
}
