package example

object ConditionExample {
  def main(args: Array[String]): Unit = {
    val list = Seq(1, 2,3)
    println(filter(list))
  }

  def filter(numbers: Seq[Int]) =
    for (number <- numbers; if number >= 2)
      yield number

}
