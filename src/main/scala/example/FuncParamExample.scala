package example

object FuncParamExample {
  def main(args: Array[String]): Unit = {
    val numbers = 1 to 10
    val list = numbers.map(add _).toList
    list foreach println
  }


  def add(num: Int): Int = num + 1

}
