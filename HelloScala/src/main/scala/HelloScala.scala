object HelloScala extends App {
  println("Hello Scala" + printTriple("!"))

  def printTriple(s: String): String = {
    return s * 3
  }
}
