package example

import org.scalatest.FlatSpec

class CurringSpec extends FlatSpec {

  "1 plus 2 " should "be 3" in {
    val sum = CurryingExample.sum(1)(2)
    assert(sum == 3)
  }


  "curriedFoldLeft " should "be 3" in {
    val sum = CurryingExample.curriedFoldLeft(0)(_ + _)
  }

  " foldLeft " should "be " in {
    val sum = CurryingExample.foldLeft(0, (m: Int, n: Int) => m + n)
  }

}
