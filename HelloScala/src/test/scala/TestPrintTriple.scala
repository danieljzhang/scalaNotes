import org.scalatest.FunSuite

class TestPrintTriple extends FunSuite {
  test("HelloScala.PrintTriple") {
    assert(HelloScala.printTriple("*") === "***")

    assert(HelloScala.printTriple("!") === "!!!")
  }
}
