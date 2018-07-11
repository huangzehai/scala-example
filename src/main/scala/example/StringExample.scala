package example

object StringExample {
  def main(args: Array[String]): Unit = {
    val text: String = null
    val isEmpty = text.isBlank
    println(isEmpty)
  }

  implicit class StringOps(s: String) {
    def isBlank(): Boolean = {
      s == null || s.isEmpty
    }
  }

}


