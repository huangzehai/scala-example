package example

object CurryingExample {

  def main(args: Array[String]): Unit = {
    val sum = (1 to 10).foldLeft(0)(_ + _)
    assert(sum == 55)

    //    val sum1 = (1 to 10).foldLeft(0, { (m: Int, n: Int) => m + n })
    //    println(sum1)
  }

  def sum(x: Int)(y: Int) = x + y

  /**
    * Curring优点：op可以进行类型推断
    *
    * @param z
    * @param op
    * @tparam Int
    * @return
    */
  def curriedFoldLeft[Int](z: Int)(op: (Int, Int) => Int): Int = {
    var result = z
    //    this foreach (x => result = op(result, x))
    result
  }

  def foldLeft[Int](z: Int, op: (Int, Int) => Int): Int = {
    var result = z
    //    this foreach (x => result = op(result, x))
    result
  }

}
