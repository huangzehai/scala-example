package example

object FuncParamExample {
  def main(args: Array[String]): Unit = {
    val numbers = 1 to 10
    val list = numbers.map(add).toList
    list foreach println

    //Expression as function parameter.
    val result = add {
      3 + 6
    }
    println(s"result is $result")
  }


  def add(num: Int): Int = num + 1

}
