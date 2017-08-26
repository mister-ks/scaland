object Lists {

  var lst = List("A","Z","C","D","E")

  def main(args: Array[String]) = lst match {
      case List("A",b,c,d,e) =>
        // println("a = " + a)
        println("b = " + b)
        println("c = " + c)
        println("d = " + d)
        println("e = " + e)
      case _ => println("nothing")
    }
}
