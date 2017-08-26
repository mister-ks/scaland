
object Pitagoras {
  def main(args: Array[String]) {
    for ( a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a * a == b * b + c * c){
      if (b != c) {
        println(" a = " + a + " b = " + b + " c = " + c)
      } else if (b == c){
        println("bingo!")
      } else {
        println("nothing!")
      }
    }
  }
}
