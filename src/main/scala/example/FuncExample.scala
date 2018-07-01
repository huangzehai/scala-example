package example

object FuncExample {

  def main(args: Array[String]): Unit = {
    val result = execByName(3 * 3)
    assert(result == 9)

    val result1 = execByName({
      3 + 9
    })
    assert(result1 == 12)

    val result2 = execByValue(3 * 3)
    assert(result2 == 9)

    val result3 = execByValue({
      3 + 9
    })
    assert(result3 == 12)
  }

  def execByName[T](func: => T) = func

  def execByValue[T](func: T) = func

}
